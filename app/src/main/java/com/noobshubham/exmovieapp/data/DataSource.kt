package com.noobshubham.exmovieapp.data

import com.noobshubham.exmovieapp.R
import com.noobshubham.exmovieapp.model.Movie

class DataSource() {

    fun loadMovie(): List<Movie> {
        return listOf<Movie>(
            Movie(R.string.spidermannwh, R.drawable.spidermannwh, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.venom, R.drawable.venom, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.the_weekend_away, R.drawable.theweekendaway, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.againts_the_ice, R.drawable.againtstheice, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.sooryavanshi, R.drawable.sooryavanshi, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.chandigarh, R.drawable.chandigarh, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.pirates, R.drawable.pirates, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.escaperoom, R.drawable.excaperoom, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.rednotice, R.drawable.rednotice, "INSERT_YOUR_LINK_HERE"),
            Movie(R.string.badhaaido, R.drawable.badhaido, "INSERT_YOUR_LINK_HERE")
        )
    }

}