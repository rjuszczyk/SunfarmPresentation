package pl.pharmaway.sunfarm.sunfarmpresentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.pharmaway.sunfarm.sunfarmpresentation.animation.AnimationUtil;
import pl.pharmaway.sunfarm.sunfarmpresentation.base.MotylActivity;

public class MadinetteSummaryActivity extends MotylActivity {

    public static void start(Context context) {
        Intent startIntent = new Intent(context, MadinetteSummaryActivity.class);
        context.startActivity(startIntent);
    }

    private View madinette_center_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.madinette_center_img = findViewById(R.id.madinette_center_img);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_madinette_summary;
    }


    @Override
    protected void onResume() {
        super.onResume();
        AnimationUtil.animateInFromCenter(this.madinette_center_img, 1 * animationLength, animationDuration);
    }

    @Override
    protected void goToNext() {
        SummaryActivity.start(this);
    }
}
