package pl.pharmaway.sunfarm.sunfarmpresentation.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import pl.pharmaway.sunfarm.sunfarmpresentation.R;
import pl.pharmaway.sunfarm.sunfarmpresentation.animation.DoWhenLayouted;

public abstract class MotylActivity extends AppCompatActivity {
    private View img_motyl;

    protected abstract int getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        this.img_motyl = findViewById(R.id.img_motyl);

        DoWhenLayouted.doWhenLayouted(img_motyl, new DoWhenLayouted.Action() {
            @Override
            public void doOnView(View view) {
                img_motyl.setPivotY(img_motyl.getHeight());
                img_motyl.setPivotX(img_motyl.getWidth());
                animateMotylUp();
            }
        });
    }

    private void animateMotylUp() {
        img_motyl
                .animate()
                .rotationX(5)
                .rotation(5)
                .setDuration(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        animateMotylDown();
                    }
                }).start();
    }

    private void animateMotylDown() {
        img_motyl
                .animate()
                .rotationX(-5)
                .rotation(-5)
                .setDuration(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        animateMotylUp();
                    }
                }).start();
    }
}
