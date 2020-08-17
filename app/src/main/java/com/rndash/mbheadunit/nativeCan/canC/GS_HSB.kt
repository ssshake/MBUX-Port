
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HSB (ID 0x050B)
**/

object GS_HSB {

    	/** Gets manual control on the test bench **/
	fun get_hsb() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSB, 0, 64)
	
	/** Sets manual control on the test bench **/
	fun set_hsb(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}