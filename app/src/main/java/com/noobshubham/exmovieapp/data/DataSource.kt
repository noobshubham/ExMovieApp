package com.noobshubham.exmovieapp.data

import com.noobshubham.exmovieapp.R
import com.noobshubham.exmovieapp.model.Movie

class DataSource() {

    fun loadMovie(): List<Movie> {
        return listOf<Movie>(
            Movie(R.string.spidermannwh, R.drawable.spidermannwh, "https://Private:Mirror%4069@pvtbot.adda.workers.dev/2:/Uploads/Spider-Man.No.Way.Home.2021.720p.10bit.BrRip.6CH.x265.HEVC-PSA/Spider-Man.No.Way.Home.2021.720p.10bit.BrRip.6CH.x265.HEVC-PSA.mkv"),
            Movie(R.string.venom, R.drawable.venom, "https://bot.jhantudrive.workers.dev/0:/Venom%20-%20Let%20There%20Be%20Carnage%20%282021%29%20720p%2010bit%20AMZN%20WEBRip%20x265%20HEVC%20%5BOrg%20BMS%20Hindi%20AAC%205.1%20320Kbps%5D%20ESubs%20~%20%28strange%29%20PSA.mkv"),
            Movie(R.string.the_weekend_away, R.drawable.theweekendaway, "https://bot.jhantudrive.workers.dev/0:/The%20Weekend%20Away%20%282022%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20%5BHindi%20AAC%205.1%20%2B%20English%20AAC%205.1%5D%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.againts_the_ice, R.drawable.againtstheice, "https://bot.jhantudrive.workers.dev/0:/Against%20The%20Ice%20%282022%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20%5BHindi%20AAC%205.1%20%2B%20English%20AAC%205.1%5D%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.sooryavanshi, R.drawable.sooryavanshi, "https://bot.jhantudrive.workers.dev/0:/Sooryavanshi%20%282021%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20Hindi%20DDP%205.1%20MSubs%20~%20Immortal.mkv"),
            Movie(R.string.chandigarh, R.drawable.chandigarh, "https://bot.jhantudrive.workers.dev/0:/Chandigarh%20Kare%20Aashiqui%20%282021%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20Hindi%20AAC%205.1%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.pirates, R.drawable.pirates, "https://bot.jhantudrive.workers.dev/0:/The%20Pirates%20The%20Last%20Royal%20Treasure%202022%20720p%20NF%20WBRip%20English%20Korean%20AAC%205.1%20MSubs%20x264%20-%20mkvAnime.mkv"),
            Movie(R.string.escaperoom, R.drawable.excaperoom, "https://bot.jhantudrive.workers.dev/0:/Escape%20Room%20-%20Tournament%20of%20Champions%20%282021%29%20Extended%20720p%2010bit%20Bluray%20x265%20HEVC%20ESubs%20%5BDD%20192kbps%205.1%20Hindi%20%2B%205.1%20English%5D%20PSA%20%20~%20Spidey.mkv"),
            Movie(R.string.rednotice, R.drawable.rednotice, "https://bot.jhantudrive.workers.dev/0:/Red%20Notice%20%282021%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20%5BHindi%20AAC%205.1%20~192Kbps%20%2B%20English%20AAC%205.1%5D%20ESub%20~%20Immortal.mkv"),
            Movie(R.string.badhaaido, R.drawable.badhaido, "https://bot.jhantudrive.workers.dev/0:/Badhaai%20Do%20%282022%29%20720p%2010bit%20NF%20WEBRip%20x265%20HEVC%20Hindi%20AAC%205.1%20ESub%20~%20Immortal.mkv")
        )
    }

}