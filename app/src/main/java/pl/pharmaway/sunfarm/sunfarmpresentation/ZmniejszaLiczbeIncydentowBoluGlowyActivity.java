package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class ZmniejszaLiczbeIncydentowBoluGlowyActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, ZmniejszaLiczbeIncydentowBoluGlowyActivity.class);
        context.startActivity(startIntent);
    }

    private View page7_chart;
    private View page7_cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page7_chart = findViewById(R.id.page7_chart);
        this.page7_cloud = findViewById(R.id.page7_cloud);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_zmniejsza_liczbe_incydentow_bolu_glowy;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page7_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page7_cloud, 4 * animationLength, 4 * animationDuration);
    }

    protected void goToNext() {
        MadinetteSummaryActivity.start(this);
    }
}
