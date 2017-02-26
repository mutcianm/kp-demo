# Kind Projector (https://github.com/non/kind-projector)

Solves issue with partially applied types
```scala
// partially-applied type named "IntOrA"
type IntOrA[A] = Either[Int, A]

// type projection implementing the same type anonymously (without a name).
({type L[A] = Either[Int, A]})#L
```
## Inline Syntax
Use "?" as a placeholder

```scala
Tuple2[?, Double]        // equivalent to: type R[A] = Tuple2[A, Double]
Either[Int, +?]          // equivalent to: type R[+A] = Either[Int, A]
Function2[-?, Long, +?]  // equivalent to: type R[-A, +B] = Function2[A, Long, B]
EitherT[?[_], Int, ?]    // equivalent to: type R[F[_], B] = EitherT[F, Int, B]
```
