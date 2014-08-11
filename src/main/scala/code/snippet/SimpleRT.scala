package code.snippet

import net.liftweb.json.JsonAST.{JString, JArray, JValue}
import net.liftweb.http.{RoundTripInfo, RoundTripHandlerFunc}
import code.lib.EmptyRoundTrip
import net.liftweb._
import common._

trait SimpleRT extends EmptyRoundTrip {
  
  private val logger = Logger(classOf[SimpleRT]) 
  
  protected def doSimpleRT(value : JValue, func : RoundTripHandlerFunc) : Unit = {
    logger.info("SimpleRT::doSimpleRT ")  
    func.send(JString("There and back again!"))
  }
  
  private val roundtrips : List[RoundTripInfo] = List("doSimpleRT" -> doSimpleRT _)
  abstract override def getRoundTrips = super.getRoundTrips ++ roundtrips  
}