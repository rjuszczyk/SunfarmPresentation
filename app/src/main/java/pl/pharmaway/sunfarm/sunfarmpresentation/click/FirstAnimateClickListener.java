package pl.pharmaway.sunfarm.sunfarmpresentation.click;

import android.view.View;

public class FirstAnimateClickListener implements View.OnClickListener {
    private final View.OnClickListener doAfterAnimation;
    public FirstAnimateClickListener(View.OnClickListener doAfterAnimation) {
        this.doAfterAnimation = doAfterAnimation;
    }

    @Override
    public void onClick(final View view) {
        doAfterAnimation.onClick(view);
//        view.animate().scaleX(1.1f).scaleY(1.1f).setInterpolator(new BounceInterpolator()).withEndAction(new Runnable() {
//            @Override
//            public void run() {
//                view.animate().scaleX(1).scaleY(1).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() {
//                    @Override
//                    public void run() {
//                        doAfterAnimation.onClick(view);
//                    }
//                });
//            }
//        });
    }
}
