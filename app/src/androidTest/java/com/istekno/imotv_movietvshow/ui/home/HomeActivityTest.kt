package com.istekno.imotv_movietvshow.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.ui.splashscreen.SplashScreenActivity
import com.istekno.imotv_movietvshow.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovie()
    private val dummyShows = DataDummy.generateDummyTVShow()

    @Before
    fun setup() {
        ActivityScenario.launch(SplashScreenActivity::class.java)
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.tv_mov_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mov_title)).check(matches(withText("${dummyMovies[0].title} (${dummyMovies[0].year})")))

        onView(withId(R.id.tv_movie_info)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_info)).check(matches(withText("${dummyMovies[0].country}   |   ${dummyMovies[0].duration}   |   ${dummyMovies[0].rating}")))

        onView(withId(R.id.tv_movie_language)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_language)).check(matches(withText(dummyMovies[0].language)))

        onView(withId(R.id.tv_movie_overview)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_overview)).check(matches(withText(dummyMovies[0].overview)))
    }

    @Test
    fun loadDetailTVShow() {
        onView(withText("TV Show")).perform(click())

        onView(withId(R.id.rv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.tv_tvs_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_tvs_title)).check(matches(withText("${dummyShows[0].title} (${dummyShows[0].year})")))

        onView(withId(R.id.tv_show_info)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_show_info)).check(matches(withText("${dummyShows[0].duration}   |   ${dummyShows[0].rating}")))

        onView(withId(R.id.tv_show_language)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_show_language)).check(matches(withText(dummyShows[0].language)))

        onView(withId(R.id.tv_show_overview)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_show_overview)).check(matches(withText(dummyShows[0].overview)))
    }
}