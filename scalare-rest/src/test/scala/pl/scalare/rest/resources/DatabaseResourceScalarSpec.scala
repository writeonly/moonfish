package pl.scalare.rest.resources

import pl.scalare.impl.repo.SelectRepoFake
import pl.scalare.rest.ViewConfiguration
import pl.scalare.spec.GrayScalarSpec

class DatabaseResourceScalarSpec extends GrayScalarSpec {
  describe("A DatabaseResourceScalarSpec") {
    val repo = new SelectRepoFake()
    val conf = new ViewConfiguration
    val rsrc = new DatabaseResource(repo, conf)
    it("when invoke databases") {
      rsrc.databases.length should be > 0
    }
  }
}
