package work.hard.parcelableissue

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DummyDataClass(
    val text: String,
) : Parcelable