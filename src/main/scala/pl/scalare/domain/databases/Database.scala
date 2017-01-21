package pl.scalare.domain.databases

import java.sql.DriverManager

import javax.sql.ConnectionPoolDataSource
import javax.sql.DataSource
import javax.sql.XADataSource
import org.skife.jdbi.v2.DBI

trait Database {

  def selects: Map[String, String] = tables.map(t => (t, Database.prefix + t)).toMap

  def tables: Set[String]

  def url: String

  def ds: DataSource

}

trait ConnectionPoolDatabase {
  def cpds: ConnectionPoolDataSource
}

trait XADatabase {
  def xads: XADataSource
}

object Database {
  val prefix = "SELECT * FROM "
}

trait DatabaseApp extends App {
  //  def selects(s : Database) = s.selects.values.foreach(v => println (v))
  def selects(s: Database) = {
    s.selects.values.foreach(v => println(v))
    s.selects.values.map(v => {
      val ds = s.ds
      val dbi = new DBI(ds)
      val h = dbi.open()
      val list = h.select(v)
      h.close()
      list
    }).foreach { x => println(x) }
  }
}
  
