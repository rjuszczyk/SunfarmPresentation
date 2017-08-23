package pl.pharmaway.sunfarm.sunfarmpresentation.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import pl.pharmaway.sunfarm.sunfarmpresentation.R;
import pl.pharmaway.sunfarm.sunfarmpresentation.animation.DoWhenLayouted;

public abstract class MotylActivity extends AppCompatActivity {
    private View img_motyl;
    private View img_motyl_green;

    protected abstract int getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        this.img_motyl = findViewById(R.id.img_motyl);
        this.img_motyl_green = findViewById(R.id.img_motyl_green);

        if(img_motyl != null)
            DoWhenLayouted.doWhenLayouted(img_motyl, new DoWhenLayouted.Action() {
                @Override
                public void doOnView(View view) {
                    img_motyl.setPivotY(img_motyl.getHeight());
                    img_motyl.setPivotX(img_motyl.getWidth());
                    animateMotylUp(img_motyl);
                }
            });

        if(img_motyl_green != null)
            DoWhenLayouted.doWhenLayouted(img_motyl_green, new DoWhenLayouted.Action() {
                @Override
                public void doOnView(View view) {
                    img_motyl_green.setPivotY(img_motyl_green.getHeight());
                    img_motyl_green.setPivotX(0);
                    animateMotylUp(img_motyl_green);
                }
            });

        View next = findViewById(R.id.next);
        if(next != null)
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToNext();
                }
            });
    }

    protected void goToNext() {

    }

    private void animateMotylUp(final View v) {
        v
                .animate()
                .rotationX(5)
                .rotation(5)
                .setDuration(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        animateMotylDown(v);
                    }
                }).start();


    }

    private void animateMotylDown(final View v) {
        v
                .animate()
                .rotationX(-5)
                .rotation(-5)
                .setDuration(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        animateMotylUp(v);
                    }
                }).start();
    }
}
