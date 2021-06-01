package work.hard.parcelableissue


interface Store<in Intent : Any, out State : Any, out Label : Any> {

    val state: State
    val isDisposed: Boolean

    fun states(observer: Observer<State>): Disposable

    fun labels(observer: Observer<Label>): Disposable

    fun accept(intent: Intent)

    fun dispose()
}