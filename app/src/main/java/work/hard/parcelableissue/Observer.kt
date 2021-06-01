package work.hard.parcelableissue

interface Observer<in T> {
    fun onNext(value: T)
    fun onComplete()
}
