package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class RedukujeObjawyBolesnegoMiesiaczkowaniaActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, RedukujeObjawyBolesnegoMiesiaczkowaniaActivity.class);
        context.startActivity(startIntent);
    }

    private View page4_chart;
    private View page4_cloud;

    final long animationLength = 100;
    final long animationDuration = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page4_chart = findViewById(R.id.page4_chart);
        this.page4_cloud = findViewById(R.id.page4_cloud);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_reguluje_objawy_bolesnego_miesiaczkowania;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page4_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page4_cloud, 2 * animationLength, animationDuration);
    }
}
