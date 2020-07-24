package $organization$

import cats.effect.{ ExitCode, IO, IOApp }

object $name;format="Camel"$ extends IOApp {
  def run(args: List[String]): IO[ExitCode] = IO.pure(ExitCode.Success)
}
