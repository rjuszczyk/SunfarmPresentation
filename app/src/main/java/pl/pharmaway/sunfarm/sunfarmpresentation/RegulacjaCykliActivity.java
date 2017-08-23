package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class RegulacjaCykliActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, RegulacjaCykliActivity.class);
        context.startActivity(startIntent);
    }

    private View page2_chart;
    private View page2_cloud;

    final long animationLength = 100;
    final long animationDuration = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page2_chart = findViewById(R.id.page2_chart);
        this.page2_cloud = findViewById(R.id.page2_cloud);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_regulacja_cykli;
    }

    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page2_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page2_cloud, 2 * animationLength, animationDuration);
    }

    protected void goToNext() {
        MadinetteSummaryActivity.start(this);
    }
}
