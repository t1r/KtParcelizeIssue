package work.hard.parcelableissue

import work.hard.parcelableissue.WorkStore.*

interface WorkStore : Store<Intent, State, Label> {

    @kotlinx.parcelize.Parcelize
    data class State(
        val isLoading: Boolean,
    ) : Parcelable

    sealed class Intent

    sealed class Label
}