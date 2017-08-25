package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class RedukujeObjawyTradzikuActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, RedukujeObjawyTradzikuActivity.class);
        context.startActivity(startIntent);
    }

    private View page8_chart;
    private View page8_cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page8_chart = findViewById(R.id.page8_chart);
        this.page8_cloud = findViewById(R.id.page8_cloud);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_redukuje_objawy_tradziku;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page8_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page8_cloud, 4 * animationLength, 4 * animationDuration);
    }

    protected void goToNext() {
        DorinSummaryActivity.start(this);
    }
}
