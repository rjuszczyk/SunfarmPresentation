package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class DorinSummaryActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, DorinSummaryActivity.class);
        context.startActivity(startIntent);
    }

    private View page_dorin_left_img;
    private View page_dorin_right_img;

    final long animationLength = 100;
    final long animationDuration = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page_dorin_left_img = findViewById(R.id.page_dorin_left_img);
        this.page_dorin_right_img = findViewById(R.id.page_dorin_right_img);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_dorin_summary;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page_dorin_left_img, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page_dorin_right_img, 2 * animationLength, animationDuration);
    }

    @Override
    protected void goToNext() {
        SummaryActivity.start(this);
    }
}
