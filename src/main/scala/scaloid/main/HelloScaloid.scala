package scaloid.main

import org.scaloid.common._
import scaloid.main._
import android.graphics.Color

class HelloScaloid extends SActivity {
  onCreate {
    contentView = new SRelativeLayout {

      SButton(R.string.start_btn).<<.wrap.marginBottom(119.dip).centerHorizontal.alignParentBottom.>>
      STextView(R.string.start_text).<<.wrap.marginTop(76.dip).centerHorizontal.alignParentTop.>>

    }

  }

}
