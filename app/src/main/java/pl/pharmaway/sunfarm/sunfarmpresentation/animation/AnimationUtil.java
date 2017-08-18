package pl.pharmaway.sunfarm.sunfarmpresentation.animation;

import android.view.View;

public class AnimationUtil {
    public static void animateAlphaIn(View view, long delay, long duration) {
        view.setAlpha(0);
        view.animate().alpha(1).setStartDelay(delay).setDuration(duration).start();
    }

    public static void animateAlphaOut(View view, long delay, long duration) {
        animateAlphaOut(view, delay, duration, null);
    }
    public static void animateAlphaOut(View view, long delay, long duration, Runnable endAction) {
        if(endAction != null) {
            view.animate().alpha(0).setStartDelay(delay).setDuration(duration).withEndAction(endAction).start();
        } else {
            view.animate().alpha(0).setStartDelay(delay).setDuration(duration).start();
        }
    }

    public static void animateInFromLeft(View view, long delay, long duration) {
        view.setAlpha(0);
        float xOffset = view.getResources().getDisplayMetrics().density * -1024;
        view.setTranslationX(xOffset);

        view.animate()
                .alpha(1)
                .translationX(0)
                .setStartDelay(delay)
                .setDuration(duration).start();
    }

    public static void animateInFromRight(View view, long delay, long duration) {
        view.setAlpha(0);
        float xOffset = view.getResources().getDisplayMetrics().density * 1024;
        view.setTranslationX(xOffset);

        view.animate()
                .alpha(1)
                .translationX(0)
                .setStartDelay(delay)
                .setDuration(duration).start();
    }
}
