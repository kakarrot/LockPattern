/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.viyu.lockpatterndemo;

public final class R {
    public static final class attr {
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int aspect=0x7f010000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Example customization of dimensions originally defined in res/values/dimens.xml
         (such as screen margins) for screens with more than 820dp of available width. This
         would include 7" and 10" devices in landscape (~960dp and ~1280dp respectively).
    
         */
        public static final int activity_horizontal_margin=0x7f040000;
        public static final int activity_vertical_margin=0x7f040001;
    }
    public static final class drawable {
        public static final int background_main=0x7f020000;
        public static final int bg_main=0x7f020001;
        public static final int btn_code_lock_default_holo=0x7f020002;
        public static final int btn_code_lock_touched_holo=0x7f020003;
        public static final int ic_launcher=0x7f020004;
        public static final int indicator_code_lock_drag_direction_green_up=0x7f020005;
        public static final int indicator_code_lock_drag_direction_red_up=0x7f020006;
        public static final int indicator_code_lock_point_area_default_holo=0x7f020007;
        public static final int indicator_code_lock_point_area_green_holo=0x7f020008;
        public static final int indicator_code_lock_point_area_red_holo=0x7f020009;
    }
    public static final class id {
        public static final int cancel_btn=0x7f060001;
        public static final int lock_pattern_view=0x7f060003;
        public static final int process_btn=0x7f060002;
        public static final int tip_textview=0x7f060000;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int activity_set_lockpattern=0x7f030001;
        public static final int activity_verify_lockpattern=0x7f030002;
    }
    public static final class string {
        public static final int app_name=0x7f050000;
        public static final int btn_cancel=0x7f050010;
        public static final int btn_retry=0x7f050011;
        public static final int lock_btn_done=0x7f05000f;
        public static final int lock_btn_next=0x7f05000e;
        public static final int lock_tip_pattern_check=0x7f050009;
        public static final int lock_tip_pattern_done=0x7f05000b;
        public static final int lock_tip_pattern_error_checkerror=0x7f05000a;
        public static final int lock_tip_pattern_error_tooless=0x7f050007;
        public static final int lock_tip_pattern_ready=0x7f050005;
        public static final int lock_tip_pattern_recored=0x7f050008;
        public static final int lock_tip_pattern_start=0x7f050006;
        /**  Accessibility description sent when user adds a cell to the pattern. 
         */
        public static final int lockscreen_access_pattern_cell_added=0x7f050003;
        /**  Accessibility description sent when the pattern times out and is cleared. 
         */
        public static final int lockscreen_access_pattern_cleared=0x7f050002;
        /**  Accessibility description sent when user completes drawing a pattern. 
         */
        public static final int lockscreen_access_pattern_detected=0x7f050004;
        /**  Accessibility description sent when user starts drawing a lock pattern. 
         */
        public static final int lockscreen_access_pattern_start=0x7f050001;
        public static final int verify_tip_error=0x7f05000d;
        public static final int verify_tip_input=0x7f05000c;
    }
    public static final class styleable {
        /** Attributes that can be used with a LockPatternView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #LockPatternView_aspect com.viyu.lockpatterndemo:aspect}</code></td><td></td></tr>
           </table>
           @see #LockPatternView_aspect
         */
        public static final int[] LockPatternView = {
            0x7f010000
        };
        /**
          <p>This symbol is the offset where the {@link com.viyu.lockpatterndemo.R.attr#aspect}
          attribute's value can be found in the {@link #LockPatternView} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.viyu.lockpatterndemo:aspect
        */
        public static final int LockPatternView_aspect = 0;
    };
}
