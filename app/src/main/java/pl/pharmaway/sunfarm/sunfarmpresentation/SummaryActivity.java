package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class SummaryActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, SummaryActivity.class);
        context.startActivity(startIntent);
    }

    private View diorin_right_img;
    private View summary_img_left;
    private View summary_bottom_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.diorin_right_img = findViewById(R.id.diorin_right_img);
        this.summary_img_left = findViewById(R.id.summary_img_left);
        this.summary_bottom_img = findViewById(R.id.summary_bottom_img);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_summary;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.summary_img_left, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.diorin_right_img, 2 * animationLength, animationDuration);
        AnimationUtil.animateInFromCenter(this.summary_bottom_img, 6 * animationLength, 4 * animationDuration);
    }
}
