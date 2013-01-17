

import annotation.tailrec
import concurrent.Future
import java.util.concurrent.atomic.{AtomicBoolean, AtomicReference}
import rx.SyncSignals.DynamicSignal


package object rx {

  object NoInitializedException extends Exception()

  type Rx[+T] = Flow.Signal[T]
  val Rx = DynamicSignal
  implicit def pimpedFutureSignal[T](source: Rx[Future[T]]) = Combinators.pimpedFutureSignal(source)

}

