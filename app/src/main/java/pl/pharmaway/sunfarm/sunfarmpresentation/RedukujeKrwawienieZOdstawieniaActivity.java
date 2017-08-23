package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class RedukujeKrwawienieZOdstawieniaActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, RedukujeKrwawienieZOdstawieniaActivity.class);
        context.startActivity(startIntent);
    }

    private View page5_chart;
    private View page5_cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page5_chart = findViewById(R.id.page5_chart);
        this.page5_cloud = findViewById(R.id.page5_cloud);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_reguluje_krwawienie_z_odstawienia;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page5_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page5_cloud, 2 * animationLength, animationDuration);
    }

    protected void goToNext() {
        MadinetteSummaryActivity.start(this);
    }
}
