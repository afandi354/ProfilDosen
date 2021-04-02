package afandi.nat.mylecturer

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Lecturer(
    var name: String = "",
    var keahlian: String = "",
    var nip: String = "",
    var jabatan: String = "",
    var photo: Int = 0
) : Parcelable