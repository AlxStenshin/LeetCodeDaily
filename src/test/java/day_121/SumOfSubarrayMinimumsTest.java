package day_121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSubarrayMinimumsTest {

    @Test
    void shouldReturnSeventeen() {
        assertEquals(17, new SumOfSubarrayMinimums().sumArrayMinBruteForce(new int[]{3, 1, 2, 4}));
    }

    @Test
    void shouldReturnFourHundredFortyFour() {
        assertEquals(444, new SumOfSubarrayMinimums().sumArrayMinBruteForce(new int[]{11, 81, 94, 43, 3}));
    }

    @Test
    void shouldReturn_134082962() {
        int[] input = new int[] {10322,29855,18404,12530,23720,2030,17116,15622,25837,17587,14559,15607,23457,10420,16734,21222,29867,20811,28857,11971,18264,22359,10453,8076,29185,10457,29998,25569,6483,24847,29509,8305,19934,23088,2499,24580,9251,21192,28505,1054,18352,8773,3440,21356,29372,15382,10391,13473,12439,15958,12276,2412,29383,29902,5225,7232,13109,20962,941,25065,19154,8079,26127,19837,9508,16436,29378,1453,21254,25483,20770,4201,17915,23579,12558,17473,7605,9383,24258,14685,13465,3687,11235,15622,6931,24239,11512,7155,9249,24734,27125,28809,456,22617,15765,3737,7397,8451,12127,14122,28104,1751,21276,25624,10719,7477,6640,9026,4359,16551,7512,818,6980,24619,12522,26507,28309,7301,16800,26433,17443,5041,7439,29629,8982,26032,23851,22260,21659,23700,25423,1871,5035,15166,6375,15997,14796,3804,2579,350,24752,2453,28847,29515,22371,13512,8274,12374,10359,11889,21786,26776,4732,7281,6297,1361,25627,15339,2012,13388,13519,23339,22842,4035,18807,15291,405,4433,20006,11011,28911,15053,20649,4009,14384,22024,25005,5989,11908,14206,13212,14264,8878,24262,27393,10471,19136,11422,17363,20867,15046,20238,22715,25299,5665,6492,15432,15290,24232,15522,27002,23329,15190,24790,14276,10252,13003,13687,19516,1565,21886,29047,13765,2064,6038,3097,7691,23818,32,26208,28187,5551,5208,28973,10812,24354,271,29724,495,18228,27854,24938,9313,24663,11792,14995,10899,10642,17463,23463,20985,23043,429,15951,10584,6259,27626,5905,5535,5365,19743,18353,15170,17605,28218,25837,27179,1625,26923,941,19430,27925,15074,12580,9953,27484,27780,18574,21433,10174,4146,29371,19711,8232,29313,18270,9918,26875,2338,24125,4788,3231,7769,21445,18241,12639,4772,27713,22989,20588,24388,23228,3373,23201,25162,22403,14469,20594,3001,22931,7867,23554,19059,15273,16081,2242,1227,445,23267,4155,3686,11552,29332,26578,9399,24594,2553,11762,17377,29588,1462,12373,27589,829,17973,11982,16809,21101,12201,26762,28672,29552,1644,25105,26352,4363,28243,3814,6220,28667,24924,17297,8635,7582,12095,270,19091,1547,23216,2105,308,8540,23181,24980,15220,28149,3436,9967,22211,9700,4361,17351,1878,11191,7617,9955,14556,16072,2531,9466,11511,12100,14402,12777,2221,6580,19329,24863,15344,4446,2115,4677,11522,16957,19928,15731,16959,10568,19968,21806,12064,24448,22318,27143,14003,10357,23317,1128,11517,29316,10268,15370,7494,2309,3329,13057,18571,16373,15561,3350,1208,10761,28275,5395,8078,14495,27427,28410,40,19437,7085,19635,22286,26615,20503,25417,23535,4822,1311,22164,15778,29936,4947,11559,8634,26361,14511,27410,21216,29965,17994,29285,5203,13251,17352,29349,17037,25958,18856,15373,11744,11060,8857,6342,28878,16094,25977,26549,28269,7146,10132,18995,9662,4318,22796,16512,16096,21315,3443,27658,14395,20755,18010,18157,21298,2664,14902,6309,11691,15353,10619,12202,21927,1300,28698,18118,4907,16717,2429,15045,20659,12594,9426,20212,28059,26210,11562,25903,3452,1762,29496,22888,18450,16764,9267,26973,25583,14452,6612,20292,21786,29866,23712,2738,29699,25636,17476,9928,21988,17899,2873,16906,606,23661,24708,21904,2745,17643,11742,3852,26763,28269,27669,15937,25933,5936,8865,27262,17712,6781,3903,6850,14881,9105,22033,8140,2354,26947,19916,29222,5460,26112,516,16135,14393,3786,24454,8126,26954,20983,25571,25995,23754,22095,123,4303,6214,17325,102,3815,14550,1232,9563,6600,5233,9499,26437,6944,19475,22020,20259,5663,10495,8165,16160,29072,6537,16572,1965,11268,28626,27255,2857,25576,21472,27538,13825,12677,26885,16085,22842,5330,2054,13215,9812,15357,10330,25878,22069,11519,3776,21296,16233,4559,1044,18502,15488,17264,12476,14062,11743,2632,16060,3649,20205,22483,5038,6046,7222,17956,12195,26626,16440,15770,6555,2726,27742,2990,3907,5860,17305,19172,12950,11847,19231,7863,24014,19202,18086,867,10362,23066,6178,19335,29242,13217,15539,6362,211,7099,14156,18129,25078,8701,9872,21620,19929,21436,26319,2661,3735,14891,18379,19623,6903,4083,27644,7203,535,8488,15516,19001,22177,4368,15237,9606,21741,10785,24335,5749,29842,15644,12716,21770,11366,1065,13227,8634,19837,15802,24903,14679,4661,4459,17179,7947,6348,28254,4179,27483,16087,28108,25171,8967,14106,2559,11001,27802,3030,7370,1282,25825,20508,17681,13970,7802,17576,21082,23790,4875,18760,20365,17436,21833,15534,28640,19506,18842,395,4307,18033,23008,4328,19105,4631,22897,24637,18619,2038,8384,8086,14036,23402,17350,29759,21248,4241,29374,1759,9986,19118,11715,666,8895,7257,23285,17777,4320,26179,6390,9591,26242,22957,12625,15579,29376,21325,21472,19674,29648,27721,8948,13355,19071,7108,19419,27099,9189,11038,13499,11590,19300,1560,23303,8561,18661,12717,18339,17069,15527,4810,226,3210,11547,7713,14544,14125,15462,3982,14923,28515,5160,467,10167,21255,25823,3279,937,9305,18662,27613,9913,23381,3826,19230,7499,22836,27364,13243,20617,10622,25473,12305,17523,29594,16730,13585,2882,28489,15747,21024,19638,7124,19113,2899,1719,25228,18024,9042,15806,16738,20334,5,4334,2796,22593,13571,5952,11235,20084,13837,16376,28126,12010,3098,3215,21742,9375,3452,23346,26665,3071,18496,22215,7376,25101,20521,13338,4972,7735,24885,5035,21140,17129,16822,490,3682,9295,18910,11444,7695,11516,13894,17838,16793,11041,12764,24188,17671,29115,18075,8499,15394,14188,25588,22125,26418,21535,7599,8185,4915,26372,27003,9707,697,14229,23652,21089,20269,631,3058,21877,24557,5467,24492,28539,18050,16552,988,12419,14010,28604,13226,358,17014,2044,29761,19791,21573,20805,28230,12149,8369,2362,685,14316,22312,22178,87,18500,24954,26009,23089,12567,21119,21047,1927,1167,10384,19301,11429,19350,22846,23142,8496,29153,16614,18838,19057,20201,4621,20238,12947,29061,21425,29220,29732,25020,17586,18021,14091,11091,12563,27405,19390,5098,1118,13175,13226,1975,6803,9943,11302,18748,4680,24654,14914,2074,2988,28296};
        assertEquals(134082962, new SumOfSubarrayMinimums().sumArrayMinBruteForce(input));
    }

    @Test
    void shouldReturnSeventeen_Optimized() {
        assertEquals(17, new SumOfSubarrayMinimums().sumSubarrayMin(new int[]{3, 1, 2, 4}));
    }

    @Test
    void shouldReturnFourHundredFortyFour_Optimized() {
        assertEquals(444, new SumOfSubarrayMinimums().sumSubarrayMin(new int[]{11, 81, 94, 43, 3}));
    }

    @Test
    void shouldReturn_134082962_Optimized() {
        int[] input = new int[] {10322,29855,18404,12530,23720,2030,17116,15622,25837,17587,14559,15607,23457,10420,16734,21222,29867,20811,28857,11971,18264,22359,10453,8076,29185,10457,29998,25569,6483,24847,29509,8305,19934,23088,2499,24580,9251,21192,28505,1054,18352,8773,3440,21356,29372,15382,10391,13473,12439,15958,12276,2412,29383,29902,5225,7232,13109,20962,941,25065,19154,8079,26127,19837,9508,16436,29378,1453,21254,25483,20770,4201,17915,23579,12558,17473,7605,9383,24258,14685,13465,3687,11235,15622,6931,24239,11512,7155,9249,24734,27125,28809,456,22617,15765,3737,7397,8451,12127,14122,28104,1751,21276,25624,10719,7477,6640,9026,4359,16551,7512,818,6980,24619,12522,26507,28309,7301,16800,26433,17443,5041,7439,29629,8982,26032,23851,22260,21659,23700,25423,1871,5035,15166,6375,15997,14796,3804,2579,350,24752,2453,28847,29515,22371,13512,8274,12374,10359,11889,21786,26776,4732,7281,6297,1361,25627,15339,2012,13388,13519,23339,22842,4035,18807,15291,405,4433,20006,11011,28911,15053,20649,4009,14384,22024,25005,5989,11908,14206,13212,14264,8878,24262,27393,10471,19136,11422,17363,20867,15046,20238,22715,25299,5665,6492,15432,15290,24232,15522,27002,23329,15190,24790,14276,10252,13003,13687,19516,1565,21886,29047,13765,2064,6038,3097,7691,23818,32,26208,28187,5551,5208,28973,10812,24354,271,29724,495,18228,27854,24938,9313,24663,11792,14995,10899,10642,17463,23463,20985,23043,429,15951,10584,6259,27626,5905,5535,5365,19743,18353,15170,17605,28218,25837,27179,1625,26923,941,19430,27925,15074,12580,9953,27484,27780,18574,21433,10174,4146,29371,19711,8232,29313,18270,9918,26875,2338,24125,4788,3231,7769,21445,18241,12639,4772,27713,22989,20588,24388,23228,3373,23201,25162,22403,14469,20594,3001,22931,7867,23554,19059,15273,16081,2242,1227,445,23267,4155,3686,11552,29332,26578,9399,24594,2553,11762,17377,29588,1462,12373,27589,829,17973,11982,16809,21101,12201,26762,28672,29552,1644,25105,26352,4363,28243,3814,6220,28667,24924,17297,8635,7582,12095,270,19091,1547,23216,2105,308,8540,23181,24980,15220,28149,3436,9967,22211,9700,4361,17351,1878,11191,7617,9955,14556,16072,2531,9466,11511,12100,14402,12777,2221,6580,19329,24863,15344,4446,2115,4677,11522,16957,19928,15731,16959,10568,19968,21806,12064,24448,22318,27143,14003,10357,23317,1128,11517,29316,10268,15370,7494,2309,3329,13057,18571,16373,15561,3350,1208,10761,28275,5395,8078,14495,27427,28410,40,19437,7085,19635,22286,26615,20503,25417,23535,4822,1311,22164,15778,29936,4947,11559,8634,26361,14511,27410,21216,29965,17994,29285,5203,13251,17352,29349,17037,25958,18856,15373,11744,11060,8857,6342,28878,16094,25977,26549,28269,7146,10132,18995,9662,4318,22796,16512,16096,21315,3443,27658,14395,20755,18010,18157,21298,2664,14902,6309,11691,15353,10619,12202,21927,1300,28698,18118,4907,16717,2429,15045,20659,12594,9426,20212,28059,26210,11562,25903,3452,1762,29496,22888,18450,16764,9267,26973,25583,14452,6612,20292,21786,29866,23712,2738,29699,25636,17476,9928,21988,17899,2873,16906,606,23661,24708,21904,2745,17643,11742,3852,26763,28269,27669,15937,25933,5936,8865,27262,17712,6781,3903,6850,14881,9105,22033,8140,2354,26947,19916,29222,5460,26112,516,16135,14393,3786,24454,8126,26954,20983,25571,25995,23754,22095,123,4303,6214,17325,102,3815,14550,1232,9563,6600,5233,9499,26437,6944,19475,22020,20259,5663,10495,8165,16160,29072,6537,16572,1965,11268,28626,27255,2857,25576,21472,27538,13825,12677,26885,16085,22842,5330,2054,13215,9812,15357,10330,25878,22069,11519,3776,21296,16233,4559,1044,18502,15488,17264,12476,14062,11743,2632,16060,3649,20205,22483,5038,6046,7222,17956,12195,26626,16440,15770,6555,2726,27742,2990,3907,5860,17305,19172,12950,11847,19231,7863,24014,19202,18086,867,10362,23066,6178,19335,29242,13217,15539,6362,211,7099,14156,18129,25078,8701,9872,21620,19929,21436,26319,2661,3735,14891,18379,19623,6903,4083,27644,7203,535,8488,15516,19001,22177,4368,15237,9606,21741,10785,24335,5749,29842,15644,12716,21770,11366,1065,13227,8634,19837,15802,24903,14679,4661,4459,17179,7947,6348,28254,4179,27483,16087,28108,25171,8967,14106,2559,11001,27802,3030,7370,1282,25825,20508,17681,13970,7802,17576,21082,23790,4875,18760,20365,17436,21833,15534,28640,19506,18842,395,4307,18033,23008,4328,19105,4631,22897,24637,18619,2038,8384,8086,14036,23402,17350,29759,21248,4241,29374,1759,9986,19118,11715,666,8895,7257,23285,17777,4320,26179,6390,9591,26242,22957,12625,15579,29376,21325,21472,19674,29648,27721,8948,13355,19071,7108,19419,27099,9189,11038,13499,11590,19300,1560,23303,8561,18661,12717,18339,17069,15527,4810,226,3210,11547,7713,14544,14125,15462,3982,14923,28515,5160,467,10167,21255,25823,3279,937,9305,18662,27613,9913,23381,3826,19230,7499,22836,27364,13243,20617,10622,25473,12305,17523,29594,16730,13585,2882,28489,15747,21024,19638,7124,19113,2899,1719,25228,18024,9042,15806,16738,20334,5,4334,2796,22593,13571,5952,11235,20084,13837,16376,28126,12010,3098,3215,21742,9375,3452,23346,26665,3071,18496,22215,7376,25101,20521,13338,4972,7735,24885,5035,21140,17129,16822,490,3682,9295,18910,11444,7695,11516,13894,17838,16793,11041,12764,24188,17671,29115,18075,8499,15394,14188,25588,22125,26418,21535,7599,8185,4915,26372,27003,9707,697,14229,23652,21089,20269,631,3058,21877,24557,5467,24492,28539,18050,16552,988,12419,14010,28604,13226,358,17014,2044,29761,19791,21573,20805,28230,12149,8369,2362,685,14316,22312,22178,87,18500,24954,26009,23089,12567,21119,21047,1927,1167,10384,19301,11429,19350,22846,23142,8496,29153,16614,18838,19057,20201,4621,20238,12947,29061,21425,29220,29732,25020,17586,18021,14091,11091,12563,27405,19390,5098,1118,13175,13226,1975,6803,9943,11302,18748,4680,24654,14914,2074,2988,28296};
        assertEquals(134082962, new SumOfSubarrayMinimums().sumSubarrayMin(input));
    }

}