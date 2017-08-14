package pl.pharmaway.sunfarm.sunfarmpresentation.animation;

import android.view.View;

public class DoWhenLayouted {
    public static void doWhenLayouted(final View view, final Action action) {
        if(view.getHeight() == 0) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    action.doOnView(view);
                }
            });
        } else {
            action.doOnView(view);
        }
    }

    public static void doWhenLayouted(final View view1, final View view2, final Action2 action) {
        doWhenLayouted(view1, new Action() {
            @Override
            public void doOnView(final View view1) {
                doWhenLayouted(view2, new Action() {
                    @Override
                    public void doOnView(View view2) {
                        action.doOnView(view1, view2);
                    }
                });
            }
        });
    }

    public static void doWhenLayouted(final View view1, final View view2, final View view3, final Action3 action) {
        doWhenLayouted(view1, new Action() {
            @Override
            public void doOnView(final View view1) {
                doWhenLayouted(view2, new Action() {
                    @Override
                    public void doOnView(final View view2) {
                        doWhenLayouted(view3, new Action() {
                                    @Override
                                    public void doOnView(View view) {
                                        action.doOnView(view1, view2, view3);
                                    }
                                }
                        );
                    }
                });
            }
        });
    }

    public interface Action {
        void doOnView(View view);
    }

    public interface Action2 {
        void doOnView(View view1, View view2);
    }

    public interface Action3 {
        void doOnView(View view1, View view2, View view3);
    }
}