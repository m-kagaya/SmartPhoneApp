package scaloid.main

import org.scaloid.common.{SActivity, SButton, STextView, SRelativeLayout}
import scaloid.main._
import android.graphics._

/**
 * Created by mitsuya on 2015/10/18.
 */
class PlayActivity extends SActivity{
  onCreate {
    contentView = new SRelativeLayout {

      SButton("test")
      STextView("遷移後画面")

    }

  }

}
