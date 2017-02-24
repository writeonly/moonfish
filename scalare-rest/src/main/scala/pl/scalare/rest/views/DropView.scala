package pl.scalare.rest.views

import com.codahale.metrics.health.HealthCheck
import io.dropwizard.views.View
import pl.scalare.rest.ViewConfiguration
import org.javatuples.Pair


class TasksView(val view: ViewConfiguration, val tasks: Array[String])
  extends View("tasks.mustache") {
}

class HealthCheckView(val view: ViewConfiguration, val checks: Array[Pair[String,HealthCheck.Result]])
  extends View("healthchecks.mustache") {
}
