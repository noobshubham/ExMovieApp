package com.noobshubham.exmovieapp.data

import com.noobshubham.exmovieapp.R
import com.noobshubham.exmovieapp.model.Movie

class DataSource() {

    fun loadMovie(): List<Movie> {
        return listOf<Movie>(
            Movie(R.string.venom, R.drawable.venom, "https://bot.jhantudrive.workers.dev/0:/Venom%20-%20Let%20There%20Be%20Carnage%20%282021%29%20720p%2010bit%20AMZN%20WEBRip%20x265%20HEVC%20%5BOrg%20BMS%20Hindi%20AAC%205.1%20320Kbps%5D%20ESubs%20~%20%28strange%29%20PSA.mkv"),
            Movie(R.string.the_weekend_away, R.drawable.theweekendaway, "https://bot.jhantudrive.workers.dev/0:/The%20Weekend%20Away%20%282022%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20%5BHindi%20AAC%205.1%20%2B%20English%20AAC%205.1%5D%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.againts_the_ice, R.drawable.againtstheice, "https://bot.jhantudrive.workers.dev/0:/Against%20The%20Ice%20%282022%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20%5BHindi%20AAC%205.1%20%2B%20English%20AAC%205.1%5D%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.sooryavanshi, R.drawable.sooryavanshi, "https://bot.jhantudrive.workers.dev/0:/Sooryavanshi%20%282021%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20Hindi%20DDP%205.1%20MSubs%20~%20Immortal.mkv"),
            Movie(R.string.chandigarh, R.drawable.chandigarh, "https://bot.jhantudrive.workers.dev/0:/Chandigarh%20Kare%20Aashiqui%20%282021%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20Hindi%20AAC%205.1%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.pirates, R.drawable.pirates, "https://bot.jhantudrive.workers.dev/0:/The%20Pirates%20The%20Last%20Royal%20Treasure%202022%20720p%20NF%20WBRip%20English%20Korean%20AAC%205.1%20MSubs%20x264%20-%20mkvAnime.mkv")
        )
    }

}