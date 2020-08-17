
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_218h (ID 0x0218)
**/

object GS_218h {

    	/** Gets Motor torque request Max **/
	fun get_mmax_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 2, 1) != 0
	
	/** Sets Motor torque request Max **/
	fun set_mmax_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	
	/** Gets engine torque request min **/
	fun get_mmin_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 1, 1) != 0
	
	/** Sets engine torque request min **/
	fun set_mmin_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	
	/** Gets motor torque request. Toggle 40ms + -10 **/
	fun get_mtgl_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 0, 1) != 0
	
	/** Sets motor torque request. Toggle 40ms + -10 **/
	fun set_mtgl_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	
	/** Gets Required. Engine torque **/
	fun get_m_egs() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 3, 13)
	
	/** Sets Required. Engine torque **/
	fun set_m_egs(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 3, 13, p)
	
	/** Gets actual gear **/
	fun get_gic() : GIC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 20, 4)) {
		 0 -> GIC.N
		 1 -> GIC.D1
		 2 -> GIC.D2
		 3 -> GIC.D3
		 4 -> GIC.D4
		 5 -> GIC.D5
		 6 -> GIC.D6
		 7 -> GIC.D7
		 8 -> GIC.D_CVT
		 9 -> GIC.R_CVT
		 10 -> GIC.R3
		 11 -> GIC.R
		 12 -> GIC.R2
		 13 -> GIC.P
		 14 -> GIC.No_Force
		 15 -> GIC.SNV
		 else -> throw Exception("Invalid raw value for GIC")
	}
	
	/** Sets actual gear **/
	fun set_gic(f: CanFrame, p: GIC) = CanBusNative.setFrameParameter(f, 20, 4, p.raw)
	
	/** Gets target gear **/
	fun get_gzc() : GZC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 16, 4)) {
		 0 -> GZC.N
		 1 -> GZC.D1
		 2 -> GZC.D2
		 3 -> GZC.D3
		 4 -> GZC.D4
		 5 -> GZC.D5
		 6 -> GZC.D6
		 7 -> GZC.D7
		 8 -> GZC.D_CVT
		 9 -> GZC.R_CVT
		 10 -> GZC.R3
		 11 -> GZC.R
		 12 -> GZC.R2
		 13 -> GZC.P
		 14 -> GZC.CANCEL
		 15 -> GZC.SNV
		 else -> throw Exception("Invalid raw value for GZC")
	}
	
	/** Sets target gear **/
	fun set_gzc(f: CanFrame, p: GZC) = CanBusNative.setFrameParameter(f, 16, 4, p.raw)
	
	/** Gets manual switching mode **/
	fun get_hsm() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 31, 1) != 0
	
	/** Sets manual switching mode **/
	fun set_hsm(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	
	/** UNKNOWN DESCRIPTION **/
	fun get_switch() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 30, 1) != 0
	
	/** UNKNOWN DESCRIPTION **/
	fun set_switch(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	
	/** Gets driving resistance high **/
	fun get_fw_hoch() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 29, 1) != 0
	
	/** Sets driving resistance high **/
	fun set_fw_hoch(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 29, 1, if(p) 1 else 0)
	
	/** Gets basic switching program o.k. **/
	fun get_gsp_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 28, 1) != 0
	
	/** Sets basic switching program o.k. **/
	fun set_gsp_ok(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 28, 1, if(p) 1 else 0)
	
	/** Gets off-road gear **/
	fun get_g_g() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 27, 1) != 0
	
	/** Sets off-road gear **/
	fun set_g_g(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	
	/** Gets Order (converter bypass) clutch "closed" **/
	fun get_k_g_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 26, 1) != 0
	
	/** Sets Order (converter bypass) clutch "closed" **/
	fun set_k_g_b(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	
	/** Gets Order (converter bypass) clutch "open" **/
	fun get_k_o_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 25, 1) != 0
	
	/** Sets Order (converter bypass) clutch "open" **/
	fun set_k_o_b(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	
	/** Gets Order (converter bypass) clutch "slip" **/
	fun get_k_s_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 24, 1) != 0
	
	/** Sets Order (converter bypass) clutch "slip" **/
	fun set_k_s_b(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	
	/** Gets drive program for AAD **/
	fun get_fpc_aad() : FPC_AAD = when(CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 38, 2)) {
		 0 -> FPC_AAD.SPORT
		 1 -> FPC_AAD.COMFORT
		 2 -> FPC_AAD.NOT_DEFINED
		 3 -> FPC_AAD.SNV
		 else -> throw Exception("Invalid raw value for FPC_AAD")
	}
	
	/** Sets drive program for AAD **/
	fun set_fpc_aad(f: CanFrame, p: FPC_AAD) = CanBusNative.setFrameParameter(f, 38, 2, p.raw)
	
	/** Gets Kickdown **/
	fun get_kd() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 37, 1) != 0
	
	/** Sets Kickdown **/
	fun set_kd(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 37, 1, if(p) 1 else 0)
	
	/** Gets Overtemperature gearbox **/
	fun get_uehitz_get() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 36, 1) != 0
	
	/** Sets Overtemperature gearbox **/
	fun set_uehitz_get(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 36, 1, if(p) 1 else 0)
	
	/** Gets GS in emergency mode **/
	fun get_gs_notl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 35, 1) != 0
	
	/** Sets GS in emergency mode **/
	fun set_gs_notl(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	
	/** Gets start release **/
	fun get_alf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 34, 1) != 0
	
	/** Sets start release **/
	fun set_alf(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	
	/** Gets bang start **/
	fun get_ks() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 33, 1) != 0
	
	/** Sets bang start **/
	fun set_ks(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	
	/** Gets gear ok **/
	fun get_get_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 32, 1) != 0
	
	/** Sets gear ok **/
	fun set_get_ok(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	
	/** Gets Motor emergency shutdown **/
	fun get_mot_naus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 47, 1) != 0
	
	/** Sets Motor emergency shutdown **/
	fun set_mot_naus(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 47, 1, if(p) 1 else 0)
	
	/** Gets MOT_NAUS confirmbit **/
	fun get_mot_naus_cnf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 46, 1) != 0
	
	/** Sets MOT_NAUS confirmbit **/
	fun set_mot_naus_cnf(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 46, 1, if(p) 1 else 0)
	
	/** Gets converter lockup clutch unloaded **/
	fun get_k_lstfr() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 45, 1) != 0
	
	/** Sets converter lockup clutch unloaded **/
	fun set_k_lstfr(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 45, 1, if(p) 1 else 0)
	
	/** Gets intervention mode / drive torque control **/
	fun get_dyn0_amr_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 42, 1) != 0
	
	/** Sets intervention mode / drive torque control **/
	fun set_dyn0_amr_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 42, 1, if(p) 1 else 0)
	
	/** Gets intervention mode / drive torque control **/
	fun get_dyn1_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 41, 1) != 0
	
	/** Sets intervention mode / drive torque control **/
	fun set_dyn1_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 41, 1, if(p) 1 else 0)
	
	/** Gets Motor torque request parity (even parity) **/
	fun get_mpar_egs() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 40, 1) != 0
	
	/** Sets Motor torque request parity (even parity) **/
	fun set_mpar_egs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 40, 1, if(p) 1 else 0)
	
	/** Gets creep torque (FFh with EGS, CVT) or CALID / CVN **/
	fun get_mkriech() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 48, 8)
	
	/** Sets creep torque (FFh with EGS, CVT) or CALID / CVN **/
	fun set_mkriech(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 48, 8, p)
	
	/** Gets Error number or counter for CALID / CVN transmission **/
	fun get_error() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 59, 5)
	
	/** Sets Error number or counter for CALID / CVN transmission **/
	fun set_error(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 59, 5, p)
	
	/** Gets CALID / CVN transmission active **/
	fun get_calid_cvn_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 58, 1) != 0
	
	/** Sets CALID / CVN transmission active **/
	fun set_calid_cvn_akt(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 58, 1, if(p) 1 else 0)
	
	/** Gets Status error check **/
	fun get_fehlprf_st() : FEHLPRF_ST = when(CanBusNative.getECUParameterC(CanCAddrs.GS_218h, 56, 2)) {
		 0 -> FEHLPRF_ST.WAIT
		 1 -> FEHLPRF_ST.OK
		 2 -> FEHLPRF_ST.ERROR
		 3 -> FEHLPRF_ST.NOT_DEFINED
		 else -> throw Exception("Invalid raw value for FEHLPRF_ST")
	}
	
	/** Sets Status error check **/
	fun set_fehlprf_st(f: CanFrame, p: FEHLPRF_ST) = CanBusNative.setFrameParameter(f, 56, 2, p.raw)
	
	
}