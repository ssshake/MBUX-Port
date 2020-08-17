
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TP_MSS_KOMBI2 (ID 0x01A6)
**/

object TP_MSS_KOMBI2 {

    	/** Gets Communication from the MSS to the KOMBI **/
	fun get_tp_mss_kombi() : Int = CanBusNative.getECUParameterB(CanBAddrs.TP_MSS_KOMBI2, 0, 64)
	
	/** Sets Communication from the MSS to the KOMBI **/
	fun set_tp_mss_kombi(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}