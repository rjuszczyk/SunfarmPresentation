package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class PozytywnieWplywaNaNastrojActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, PozytywnieWplywaNaNastrojActivity.class);
        context.startActivity(startIntent);
    }

    private View page3_chart_left;
    private View page3_cloud_left;
    private View page3_chart_right;
    private View page3_cloud_right;

    final long animationLength = 100;
    final long animationDuration = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page3_chart_left = findViewById(R.id.page3_chart_left);
        this.page3_cloud_left = findViewById(R.id.page3_cloud_left);
        this.page3_chart_right = findViewById(R.id.page3_chart_right);
        this.page3_cloud_right = findViewById(R.id.page3_cloud_right);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_pozytywnie_wplywa_na_nastroj;
    }

    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page3_chart_left, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page3_cloud_left, 2 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page3_chart_right, 3 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page3_cloud_right, 4 * animationLength, animationDuration);
    }
}
