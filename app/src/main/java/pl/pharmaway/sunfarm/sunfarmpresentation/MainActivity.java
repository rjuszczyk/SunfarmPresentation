package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.animation.DoWhenLayouted;
import pl.pharmaway.sunfarm.sunfarmpresentation.click.FirstAnimateClickListener;

public class MainActivity extends AppCompatActivity {
    final long animationLength = 100;
    final long animationDuration = 300;

    View puzzel_1;
    View puzzel_2;
    View puzzel_3;
    View puzzel_4;
    View puzzel_5;
    View puzzel_6;
    View puzzel_7;
    View img_motyl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.puzzel_1 = findViewById(R.id.puzzel_1);
        this.puzzel_2 = findViewById(R.id.puzzel_2);
        this.puzzel_3 = findViewById(R.id.puzzel_3);
        this.puzzel_4 = findViewById(R.id.puzzel_4);
        this.puzzel_5 = findViewById(R.id.puzzel_5);
        this.puzzel_6 = findViewById(R.id.puzzel_6);
        this.puzzel_7 = findViewById(R.id.puzzel_7);
        this.img_motyl = findViewById(R.id.img_motyl);





        DoWhenLayouted.doWhenLayouted(img_motyl, new DoWhenLayouted.Action() {
            @Override
            public void doOnView(View view) {
                img_motyl.setPivotY(img_motyl.getHeight());
                img_motyl.setPivotX(img_motyl.getWidth());
                animateMotylUp();
            }
        });

        FirstAnimateClickListener firstAnimateClickListener = new FirstAnimateClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AnimationUtil.animateAlphaOut(puzzel_1, 1 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_2, 2 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_3, 3 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_4, 4 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_5, 5 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_6, 6 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_7, 7 * animationLength, animationDuration, new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        this.puzzel_1.setOnClickListener(firstAnimateClickListener);
        this.puzzel_2.setOnClickListener(firstAnimateClickListener);
        this.puzzel_3.setOnClickListener(firstAnimateClickListener);
        this.puzzel_4.setOnClickListener(firstAnimateClickListener);
        this.puzzel_5.setOnClickListener(firstAnimateClickListener);
        this.puzzel_6.setOnClickListener(firstAnimateClickListener);
        this.puzzel_7.setOnClickListener(firstAnimateClickListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateAlphaIn(this.puzzel_1, 1 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_2, 2 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_3, 3 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_4, 4 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_5, 5 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_6, 6 * animationLength, animationDuration);
        AnimationUtil.animateAlphaIn(this.puzzel_7, 7 * animationLength, animationDuration);
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
