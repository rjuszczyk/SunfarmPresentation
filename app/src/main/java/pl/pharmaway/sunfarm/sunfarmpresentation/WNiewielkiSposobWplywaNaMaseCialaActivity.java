package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class WNiewielkiSposobWplywaNaMaseCialaActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, WNiewielkiSposobWplywaNaMaseCialaActivity.class);
        context.startActivity(startIntent);
    }

    private View page6_chart;
    private View page6_cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.page6_chart = findViewById(R.id.page6_chart);
        this.page6_cloud = findViewById(R.id.page6_cloud);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_w_niewielki_sposob_wplywa_na_mase_ciala;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromLeft(this.page6_chart, 1 * animationLength, animationDuration);
        AnimationUtil.animateInFromRight(this.page6_cloud, 4 * animationLength, 4 * animationDuration);
    }

    protected void goToNext() {
        MadinetteSummaryActivity.start(this);
    }
}
