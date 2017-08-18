package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;
import pl.pharmaway.sunfarm.sunfarmpresentation.click.FirstAnimateClickListener;

public class HomeActivity extends MotylActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        context.startActivity(intent);
    }

    final long animationLength = 100;
    final long animationDuration = 300;

    View puzzel_1;
    View puzzel_2;
    View puzzel_3;
    View puzzel_4;
    View puzzel_5;
    View puzzel_6;
    View puzzel_7;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.puzzel_1 = findViewById(R.id.puzzel_1);
        this.puzzel_2 = findViewById(R.id.puzzel_2);
        this.puzzel_3 = findViewById(R.id.puzzel_3);
        this.puzzel_4 = findViewById(R.id.puzzel_4);
        this.puzzel_5 = findViewById(R.id.puzzel_5);
        this.puzzel_6 = findViewById(R.id.puzzel_6);
        this.puzzel_7 = findViewById(R.id.puzzel_7);

        FirstAnimateClickListener firstAnimateClickListener = new FirstAnimateClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                AnimationUtil.animateAlphaOut(puzzel_1, 1 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_2, 2 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_3, 3 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_4, 4 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_5, 5 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_6, 6 * animationLength, animationDuration);
                AnimationUtil.animateAlphaOut(puzzel_7, 7 * animationLength, animationDuration, new Runnable() {
                    @Override
                    public void run() {
                        switch (view.getId()) {
                            case R.id.puzzel_1:
                                RegulacjaCykliActivity.start(HomeActivity.this);
                                break;
                            case R.id.puzzel_2:
                                PozytywnieWplywaNaNastrojActivity.start(HomeActivity.this);
                                break;
                            case R.id.puzzel_3:
                                RedukujeObjawyBolesnegoMiesiaczkowaniaActivity.start(HomeActivity.this);
                                break;
                            case R.id.puzzel_4:
                                break;
                            case R.id.puzzel_5:
                                break;
                            case R.id.puzzel_6:
                                break;
                            case R.id.puzzel_7:
                                break;
                        }

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
}
