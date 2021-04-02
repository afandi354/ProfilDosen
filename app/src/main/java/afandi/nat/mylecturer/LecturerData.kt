package afandi.nat.mylecturer

object LecturerData {
    private val lecturerNames = arrayOf(
        "Sukamto, S.Kom., M.T",
        "Dr. Kurnianingsih, M.T",
        "Drs. Parsumo Raharjo, M.Kom",
        "Mardiyono, S.Kom., M.Sc",
        "T R Yudantoro, M.Kom",
        "Slamet Handoko, M.Kom ",
        "Idhawati Hestiningsih, M.Kom",
        "Prayitno, S.ST., M.T",
        "Liliek Triyono, S.T., M.Kom",
        "M Irwan Yanwari, S.Kom., M.Eng"
    )

    private val lecturerJabatan = arrayOf(
        "Kaprodi D3 TI",
        "Kaprodi STr TRK",
        "Sekjur Teknik Elektro",
        "Kepala UPT TIK",
        "Dosen Prodi TI",
        "Kalab Prodi TI",
        "Dosen Prodi TI",
        "Dosen Prodi TI",
        "Dosen Prodi TI",
        "Dosen Prodi TI"
    )

    private val lecturerNIP = arrayOf(
        "197101172003121001",
        "197904262003122002",
        "196008221988031001",
        "197403112000121001",
        "196810252000121001",
        "197501302001121001",
        "197711192008012013",
        "198504102014041002",
        "198404202015041003",
        "199001072019031020"
    )

    private val lecturerKeahlian = arrayOf(
        "Mobile Development, \nDatabase Programming",
        "Kecerdasan buatan,\nPembelajaran Mesin,\n Visi Komputer",
        "Jaringan Komputer, \nVirtualisasi",
        "Kecerdasan Buatan, \nInternet of Things",
        "Rekayasa Perangkat Lunak, \nJaringan komputer",
        "Database Programming, \nVisualisasi Data",
        "Pemrograman Berorientasi Objek, \nMobile Development",
        "Kecerdasan Buatan, \nMobile Development",
        "Web Development, \nDesain Grafis",
        "Web Development, \nGame Development, \nDesain Grafis"
    )

    private val lecturerImages = intArrayOf(
        R.drawable.kamto,
        R.drawable.kurnianingsih,
        R.drawable.parsumo,
        R.drawable.mardi,
        R.drawable.yudan,
        R.drawable.handoko,
        R.drawable.idha,
        R.drawable.prayit,
        R.drawable.liliek,
        R.drawable.irwan
    )

    val listData: ArrayList<Lecturer>
        get() {
            val list = arrayListOf<Lecturer>()
            for(position in lecturerNames.indices){
                val lecturer = Lecturer()
                lecturer.name = lecturerNames[position]
                lecturer.keahlian = lecturerKeahlian[position]
                lecturer.photo = lecturerImages[position]
                lecturer.nip = lecturerNIP[position]
                lecturer.jabatan = lecturerJabatan[position]
                list.add(lecturer)
            }
            return list
        }
}