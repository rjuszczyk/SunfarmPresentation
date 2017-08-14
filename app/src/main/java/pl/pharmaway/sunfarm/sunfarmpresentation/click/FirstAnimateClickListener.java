package pl.pharmaway.sunfarm.sunfarmpresentation.click;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;

public class FirstAnimateClickListener implements View.OnClickListener {
    private final View.OnClickListener doAfterAnimation;
    public FirstAnimateClickListener(View.OnClickListener doAfterAnimation) {
        this.doAfterAnimation = doAfterAnimation;
    }

    @Override
    public void onClick(final View view) {
        view.animate().scaleX(1.2f).scaleY(1.2f).setInterpolator(new BounceInterpolator()).withEndAction(new Runnable() {
            @Override
            public void run() {
                view.animate().scaleX(1).scaleY(1).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        doAfterAnimation.onClick(view);
                    }
                });
            }
        });
    }
}
