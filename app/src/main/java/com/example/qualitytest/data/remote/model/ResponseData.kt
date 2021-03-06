package com.example.qualitytest.data.remote.model

import com.google.gson.annotations.SerializedName

class ResponseData(
    @SerializedName("rates") var rates: Data
) {
    data class Data(
        @SerializedName("AED") var aed: Double,
        @SerializedName("AFN") var afn: Double,
        @SerializedName("ALL") var all: Double,
        @SerializedName("AMD") var amd: Double,
        @SerializedName("ANG") var ang: Double,
        @SerializedName("AOA") var aoa: Double,
        @SerializedName("ARS") var ars: Double,
        @SerializedName("AUD") var aud: Double,
        @SerializedName("AWG") var awg: Double,
        @SerializedName("AZN") var azn: Double,
        @SerializedName("BAM") var bam: Double,
        @SerializedName("BBD") var bbd: Double,
        @SerializedName("BDT") var bdt: Double,
        @SerializedName("BGN") var bgn: Double,
        @SerializedName("BHD") var bhd: Double,
        @SerializedName("BIF") var bif: Double,
        @SerializedName("BMD") var bmd: Double,
        @SerializedName("BND") var bnd: Double,
        @SerializedName("BOB") var bob: Double,
        @SerializedName("BRL") var brl: Double,
        @SerializedName("BSD") var bsd: Double,
        @SerializedName("BTC") var btc: Double,
        @SerializedName("BTN") var btn: Double,
        @SerializedName("BWP") var bwp: Double,
        @SerializedName("BYN") var byn: Double,
        @SerializedName("BZD") var bzd: Double,
        @SerializedName("CAD") var cad: Double,
        @SerializedName("CDF") var cdf: Double,
        @SerializedName("CHF") var chf: Double,
        @SerializedName("CLF") var clf: Double,
        @SerializedName("CLP") var clp: Double,
        @SerializedName("CNH") var cnh: Double,
        @SerializedName("CNY") var cny: Double,
        @SerializedName("COP") var cop: Double,
        @SerializedName("CRC") var crc: Double,
        @SerializedName("CUC") var cuc: Double,
        @SerializedName("CUP") var cup: Double,
        @SerializedName("CVE") var cve: Double,
        @SerializedName("CZK") var czk: Double,
        @SerializedName("DJF") var djf: Double,
        @SerializedName("DKK") var dkk: Double,
        @SerializedName("DOP") var dop: Double,
        @SerializedName("DZD") var dzd: Double,
        @SerializedName("EGP") var egp: Double,
        @SerializedName("ERN") var ern: Double,
        @SerializedName("ETB") var etb: Double,
        @SerializedName("EUR") var eur: Double,
        @SerializedName("FJD") var fjd: Double,
        @SerializedName("FKP") var fkp: Double,
        @SerializedName("GBP") var gbp: Double,
        @SerializedName("GEL") var gel: Double,
        @SerializedName("GGP") var ggp: Double,
        @SerializedName("GHS") var ghs: Double,
        @SerializedName("GIP") var gip: Double,
        @SerializedName("GMD") var gmd: Double,
        @SerializedName("GNF") var gnf: Double,
        @SerializedName("GTQ") var gtq: Double,
        @SerializedName("GYD") var gyd: Double,
        @SerializedName("HKD") var hkd: Double,
        @SerializedName("HNL") var hnl: Double,
        @SerializedName("HRK") var hrk: Double,
        @SerializedName("HTG") var htg: Double,
        @SerializedName("HUF") var huf: Double,
        @SerializedName("IDR") var idr: Double,
        @SerializedName("ILS") var ilt: Double,
        @SerializedName("IMP") var imp: Double,
        @SerializedName("INR") var inr: Double,
        @SerializedName("IQD") var iqd: Double,
        @SerializedName("IRR") var irr: Double,
        @SerializedName("ISK") var isk: Double,
        @SerializedName("JEP") var jep: Double,
        @SerializedName("JMD") var jmd: Double,
        @SerializedName("JOD") var jod: Double,
        @SerializedName("JPY") var jpy: Double,
        @SerializedName("KES") var kes: Double,
        @SerializedName("KGS") var kgs: Double,
        @SerializedName("KHR") var khr: Double,
        @SerializedName("KMF") var kmf: Double,
        @SerializedName("KPW") var kpw: Double,
        @SerializedName("KRW") var krw: Double,
        @SerializedName("KWD") var kwd: Double,
        @SerializedName("KYD") var kyd: Double,
        @SerializedName("KZT") var kzt: Double,
        @SerializedName("LAK") var lak: Double,
        @SerializedName("LBP") var lbp: Double,
        @SerializedName("LKR") var lkr: Double,
        @SerializedName("LRD") var ldr: Double,
        @SerializedName("LSL") var lsl: Double,
        @SerializedName("LYD") var lyd: Double,
        @SerializedName("MAD") var mad: Double,
        @SerializedName("MDL") var mdl: Double,
        @SerializedName("MGA") var mga: Double,
        @SerializedName("MKD") var mkd: Double,
        @SerializedName("MMK") var mmk: Double,
        @SerializedName("MNT") var mnt: Double,
        @SerializedName("MOP") var mop: Double,
        @SerializedName("MRU") var mru: Double,
        @SerializedName("MUR") var mur: Double,
        @SerializedName("MVR") var mvr: Double,
        @SerializedName("MWK") var mwk: Double,
        @SerializedName("MXN") var mxn: Double,
        @SerializedName("MYR") var myr: Double,
        @SerializedName("MZN") var mzn: Double,
        @SerializedName("NAD") var nad: Double,
        @SerializedName("NGN") var ngn: Double,
        @SerializedName("NIO") var nio: Double,
        @SerializedName("NOK") var nok: Double,
        @SerializedName("NPR") var npr: Double,
        @SerializedName("NZD") var nzd: Double,
        @SerializedName("OMR") var omr: Double,
        @SerializedName("PAB") var pab: Double,
        @SerializedName("PEN") var pen: Double,
        @SerializedName("PGK") var pgk: Double,
        @SerializedName("PHP") var php: Double,
        @SerializedName("PKR") var pkr: Double,
        @SerializedName("PLN") var pln: Double,
        @SerializedName("PYG") var pyg: Double,
        @SerializedName("QAR") var qar: Double,
        @SerializedName("RON") var ron: Double,
        @SerializedName("RSD") var rsd: Double,
        @SerializedName("RUB") var rub: Double,
        @SerializedName("RWF") var rwf: Double,
        @SerializedName("SAR") var sar: Double,
        @SerializedName("SBD") var sbd: Double,
        @SerializedName("SCR") var scr: Double,
        @SerializedName("SDG") var sdg: Double,
        @SerializedName("SEK") var sek: Double,
        @SerializedName("SGD") var sgd: Double,
        @SerializedName("SHP") var shp: Double,
        @SerializedName("SLL") var sll: Double,
        @SerializedName("SOS") var sos: Double,
        @SerializedName("SRD") var srd: Double,
        @SerializedName("SSP") var ssp: Double,
        @SerializedName("STD") var std: Double,
        @SerializedName("STN") var stn: Double,
        @SerializedName("SVC") var svc: Double,
        @SerializedName("SYP") var syp: Double,
        @SerializedName("SZL") var szl: Double,
        @SerializedName("THB") var thb: Double,
        @SerializedName("TJS") var tjs: Double,
        @SerializedName("TMT") var tmt: Double,
        @SerializedName("TND") var tnd: Double,
        @SerializedName("TOP") var top: Double,
        @SerializedName("TRY") var tiy: Double,
        @SerializedName("TTD") var ttd: Double,
        @SerializedName("TWD") var twd: Double,
        @SerializedName("TZS") var tzs: Double,
        @SerializedName("UAH") var uah: Double,
        @SerializedName("UGX") var ugx: Double,
        @SerializedName("USD") var usd: Double,
        @SerializedName("UYU") var uyu: Double,
        @SerializedName("UZS") var uzs: Double,
        @SerializedName("VES") var ves: Double,
        @SerializedName("VND") var vnd: Double,
        @SerializedName("VUV") var vuv: Double,
        @SerializedName("WST") var wst: Double,
        @SerializedName("XAF") var xaf: Double,
        @SerializedName("XAG") var xag: Double,
        @SerializedName("XAU") var xau: Double,
        @SerializedName("XCD") var xcd: Double,
        @SerializedName("XDR") var xdr: Double,
        @SerializedName("XOF") var xof: Double,
        @SerializedName("XPD") var xpd: Double,
        @SerializedName("XPF") var xpf: Double,
        @SerializedName("XPT") var xpt: Double,
        @SerializedName("YER") var yer: Double,
        @SerializedName("ZAR") var zar: Double,
        @SerializedName("ZMW") var zmw: Double,
        @SerializedName("ZWL") var zwl: Double,
    )
}