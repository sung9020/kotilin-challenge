import java.util.Arrays;

/*
 *
 * @author snow
 * @since 2024/07/20
 */
public class Quest105 {
    public static void main(String[] args) {
        int[] spells = new int[]{
                560298
        };

        int[] potions = new int[]{

                68460,91879,36597,48406,45552,29774,99922,50056,76873,96948,97065,88424,24302,26425,74052,67581,39559,8998,96343,97778,71166,84896,76277,65473,85053,26893,78671,54557,80936,78558,82375,22708,96804,43485,35901,22691,50553,94487,19269,34222,54280,81544,55841,70039,87821,38329,46395,74111,72898,77519,82154,82306,36301,76945,75266,75411,67620,35122,70944,32270,45708,53475,15903,31213,13463,87647,43179,52106,21952,93616,86371,94033,68174,97928,66037,62327,55193,50503,79185,82701,68202,49527,48758,59736,90353,86946,69521,39136,42360,78421,82053,98931,98897,95139,65457,72698,78169,76496,94287,64882,43227,97918,83874,92930,23154,96543,58749,96360,73641,83588,90969,89443,97526,24679,12039,63493,51487,79221,53671,32922,82821,48357,68164,84511,98399,73050,86878,97010,93343,56906,13122,87289,73880,98801,57054,89870,74357,90777,87314,72731,24560,89206,83497,76527,33534,74881,66674,44007,61306,93890,62048,99364,64296,80532,20125,30382,47123,57707,43700,97044,82909,92190,97022,58982,48350,67826,73990,16953,65986,44312,93623,32918,28426,7882,94349,92399,77849,89584,69447,65956,34301,85509,73788,81879,98510,3990,47782,90889,89823,75238,73799,92775,30832,78508,69843,90960,79341,95623,92405,87569,87201,43570,84678,86683,35205,72237,78825,77620,31702,88011,88452,84410,30303,90078,79777,54960,57669,32601,31516,23669,33437,55129,82679,87385,54264,41281,69265,41962,98435,42263,91994,88637,56222,79388,21749,36996,99278,98167,99566,80364,90356,99646,83754,85322,99833,96697,13538,82504,92020,64291,95902,48691,98238,99292,51462,67236,72122,98115,78022,51441,99799,93362,91989,90732,44616,91153,55670,77112,64595,91178,23371,27406,85611,42484,60310,81960,75342,46656,37648,67049,33976,56417,55714,22525,94677,57130,46424,99580,66160,43041,81031,52049,83581,83432,67080,69582,61501,40361,69206,64943,87497,76424,92321,77812,86498,82289,54673,34098,27732,94832,39133,88388,78629,62544,93752,67180,69590,97865,76942,80216,96692,4471,72170,68267,89397,68760,96551,68221,66742,77845,69442,91631,87851,82684,61433,57714,24717,98784,77797,93881,29701,68685,68139,83156,85225,84600,44619,59599,79456,52483,50147,74630,89819,88399,85380,85662,35574,95573,75685,65769,95251,65479,71562,95920,89942,40221,80234,76091,61044,77753,37446,89055,28992,46403,75343,59035,73960,82839,35340,10289,83332,73627,20356,78230,27608,81006,79054,53746,73762,65675,37392,85759,17470,79607,89101,46872,77488,95718,99121,88888,59776,27536,92194,89918,51035,56078,62757,90560,76779,75232,96577,75346,90650,80902,57168,62193,68197,60572,91605,81437,15572,34879,29603,42534,90614,66767,83707,87336,78995,31051,40241,88970,57420,98720,41964,93813,31804,79985,52033,87843,50770,39954,75269,72047,71677,86047,84693,85495,80711,61047,43649,92181,68332,45389,97675,75233,16397,72628,62879,61373,46128,83059,97466,79640,70034,15117,97265,99279,97067,93907,60873,82528,46986,98804,68858,85116,83169,92286,55433,50259,89585,85058,59985,16472,70208,33517,47537,97519,76027,83186,40827,44237,55900,88456,84795,90020,78987,59129,41951,76940,85562,58216,84494,87486,54267,44798,36489,89955,48778,78742,57036,91320,81569,78647,88912,15277,48232,51632,65313,27370,67529,55529,40500,99846,77266,95661,54574,65086,90380,47583,83752,24839,61974,74494,71974,41205,97687,87192,21640,75030,33736,78680,69905,97375,45515,57239,92923,22862,40252,61073,67712,96789,58196,95030,82991,32210,28542,84255,83720,75614,68093,83454,60667,97980,31194,74391,94812,50781,39270,89750,37085,99361,85151,69014,95516,10927,86703,99878,53689,54029,79181,46449,49291,68463,76582,54966,45443,91937,33696,43669,85067,73387,10572,50017,85668,28498,72696,97674,93728,96321,94439,96340,72400,91937,93623,85150,51657,58206,60389,93975,77060,84519,96092,52872,98214,96099,44800,88549,85327,54464,71130,81458,76224,98439,40123,51391,18644,80318,41226,65375,25051,95802,92472,78988,73562,95557,92960,59098,79577,96760,47179,83751,81130,19468,83807,86500,84200,90441,77651,30745,30338,73985,59222,38193,43865,70859,57896,98264,37041,91154,80967,94060,89390,98218,72227,43218,64061,97993,70297,48613,90766,86643,85620,98358,62582,47314,85160,24617,91700,93879,64244,66514,59810,55054,92489,41069,39431,89480,58814,83658,59072,90651,92213,42655,52741,51343,77117,81089,67107,55736,22262,74108,83401,95467,65092,62867,60704,97095,95077,40631,56776,94561,35314,93839,56620,53139,61872,91262,86479,48309,73170,57333,95022,88378,87860,53174,56297,18195,67659,95571,27777,73343,83783,77532,30508,93470,81809,70173,79137,69970,77637,62684,99422,82347,58552,27918,92828,5896,69954,88472,46488,90655,46132,79316,71739,78641,64663,95840,55379,36153,89654,73334,62782,95797,98297,52109,59009,54089,94577,82081,99186,57240,86393,56547,30509,73815,94876,70895,88304,34281,74692,65516,99218,74762,30930,75593,47774,97366,80612,89990,94453,64479,52042,75056,82687,90415,25742,43358,84027,51520,22693,97359,78475,62052,83897,78229,95683,30063,61981,46315,43051,63934,96054,58648,34292,63785,19142,47894,58882,44693,81332,31739,27812,88339,34307,90299,73526,96272,83547,81897,31551,64676,57422,46899,52471,60275,77874,90657,84154,28479,93511,46310,45141,25978,54554,91862,76062,81758,80827,75603,56712,67876,79721,68664,60558,62799,43586,57925,63428,82028,91238,97676,44724,73471,78845,56820,99357,19267,72945,64793,89741,81577,88345,50735,95787,97356,84642,18272,81701,87855,93442,40095,85630,68160,14088,62988,92744,88629,89114,69277,94392,72327,30384,63009,60704,72086,49769,50915,77308,61487,96523,42862,64291,64915,38662,55030,26241,12778,79905,92538,96152,81173,86535,96424,30612,98315,93141,83925,87829,58859,96469,94505,90733,68855,63375,70064,61651,87794,57102,92620,97398,89044,24454,86066,80390,82392,58466,42535,52395,11798,69120,50348,28955,99638,69390,84342,90970,51107,89192,53012,51794,19501,83778,68595,77475,97955,57282,78683,49043,54435,93808,97135,73792,15682,99740,83475,35813,71561,68196,65973,82681,90517,79409,66032,57466,57471,82317,99155,86398,98008,16032,75137,91446,46912,50350,80725,37320,86979,38729,69576,29208,61090,85219,80549,12669,66565,27272,25639,98224,85271,84098,54581,95162,42048,91105,67848,64453,54938,82675,70145,92083,49664,84522,92945,37290,40130,71529,98355,95824,24692,58609,81253,76593,50771,47172,49019,97449,3333,50423,59495,80981,61545,59966,41533,78194,89394,76409,85724,88936,51004,74938,51680,19604,35970,58432,90375,76119,76262,67444,84562,76876,86786,32293,65393,92273,31205,83869,89555,74185,66167,36913,66932,72648,83972,93077,30930,94438,98418,57274,49575,95651,98122,47277,49878,83578,91853,82797,73711,75249,48718,56227,97425,29254,37043,93768,16576,86657,75702,58738,81830,66488,88139,96656,85108,51484,60178,50802,73664,55255,53448,6469,88682,37331,55653,93642,99639,22917,65544,92334,44990,66513,76549,68445,41393,74132,80759,33703,50507,62173,81134,55862,80314,70323,73822,12610,49177,76792,98358,45188,45063,95431,83933,85603,53343,52401,97086,74620,89984,97270,96937,40265,77341,65680,65988,91845,84276,98144,99362,15246,46961,54448,80423,35315,84458,59753,38372,90388,98101,98753,97859,74677,30615,69014,69466,4767,70975,92514,93038,92895,98595,94686,74050,96823,79322,8018,77240,78087,45026,99352,49773,62585,1351,54899,35572,88037,81218,75463,65175,81918,98841,94589,52944,46903,77427,21967,91126,71328,47601,65987,77308,46361,25342,89602,91134,71318,78249,86703,93435,96545,55577,60365,93086,63704,77339,44958,53374,69597,91020,88347,65142,57985,26335,51240,95843,91339,47178,96930,86360,30729,55891,17962,76000,82999,49884,46597,62149,96526,40148,73343,29024,46488,57316,46461,71791,52446,14560,68519,50998,97123,42692,69408,73194,43937,76622,94895,72913,43464,68438,67038,62262,55945,54083,35341,83547,88324,9420,85812,17145,60242,80317,82601,50904,91195,79850,72591,53067,73543,73944,99626,48682,74828,81375,37510,44333,41170,41329,86484,37981,46371,65033,67977,93649,92223,73026,59162,44296,69713,69463,27180,63084,93987,88089,90779,81652,56959,90555,79616,48628,98676,42980,23091,77153,50996,78623,76146,93905,70021,79261,96945,32952,84184,53233,32657,82815,75684,92773,52748,35410,66713,78362,57126,77023,87184,99992,83017,98598,89170,30743,37076,64877,30493,94706,68983,81455,35096,52336,20287,27424,49093,82555,64018,79677,72853,50036,61536,90239,7959,69951,48756,89552,57774,70367,71064,88150,52546,94428,26113,89414,90503,79193,74057,48188,31324,84754,83098,82035,46789,71059,87779,89052,62104,95696,75459,70158,91185,82930,60186,77563,23649,74388,83032,52016,66157,84625,79505,95392,82646,75262,81549,88226,10356,54109,82509,70008,87542,68743,92577,90881,69217,50702,71008,48581,59851,27956,26625,59543,81836,76225,82498,47486,94569,90205,57410,22293,94382,44700,50411,98075,98668,91960,82238,73892,63809,78384,65480,16373,36497,36686,54228,95819,83106,34175,94866,84316,78422,98995,35155,86512,61774,84793,20209,8786,54234,89213,57778,83880,40031,72623,82312,64300,93329,78618,42257,78935,35218,31576,71226,98380,45620,55163,80953,32590,42839,90378,99721,82155,91073,73474,94191,62240,52746,62479,69529,75475,13252,82577,39980,28424,47486,78472,85572,47359,68327,32883,49359,9540,27871,32543,38346,62237,72451,43431,30104,66967,95248,97144,94703,92081,85597,64139,80870,72905,95735,36222,85132,22448,74495,56355,68530,90607,40530,51168,37492,85802,89664,48353,58458,61988,68654,94616,86394,83776,87919,63555,92487,82428,79869,97003,73711,86055,56501,66486,24421,79820,90908,25294,80243,50013,31483,99023,95144,42231,64912,89752,37974,31473,23356,98208,92108,93193,82285,88829,71048,89606,57331,94162,94364,90177,93015,87243,38086,63053,94347,86640,19298,97279,79214,78630,98776,61375,72326,45655,80517,72247,42918,26371,74960,61436,43788,17327,47333,38205,43853,50351,82049,63152,56588,90891,26148,45925,56526,72042,95812,75830,39028,39213,99540,63635,87934,87567,62812,78997,67791,64538,88603,78236,36693,83393,71320,62153,59460,96582,94505,18635,74894,91440,32126,71472,73148,97502,75535,54991,88493,74925,67661,99435,38250,60450,90148,66525,79714,98275,76472,29499,74759,77855,55288,30294,35764,77042,88640,9030,59461,50077,88203,42370,82587,93537,27155,79968,19597,83799,37814,83821,43081,28323,66905,61623,16304,76958,64348,82386,63341,68028,84974,81884,95466,59430,94436,73725,95857,53503,75403,42369,79822,73322,76994,90681,65231,75390,74934,93989,39205,67669,74578,89039,30768,79585,97131,73756,35784,98979,94861,55035,55033,95965,77917,96005,49666,75742,77714,99418,30012,53285,88833,20019,60783,95423,11352,97023,68374,47759,79891,83738,20916,39366,93796,37284,69751,10944,66656,31081,36758,95082,45097,59260,94213,48818,88139,49365,40997,98704,99118,29360,75164,37953,85276,5559,84785,60651,88899,97689,27874,72375,80235,67809,57399,52728,46082,68283,2317,88660,89387,77960,83492,22916,62634,78955,39153,87093,98663,94598,75144,70829,67727,74454,69208,65149,74044,78258,35091,73385,97840,36752,77575,18880,2643,81607,62435,34847,82443,80867,49408,33888,70483,83013,69890,73479,79576,44255,56475,62620,93216,55056,40409,85216,95137,82748,83168,84704,95792,57563,70043,17308,65516,17678,98847,50026,94185,98032,66001,90721,44092,46193,43574,86672,78948,53332,38892,81692,55846,96506,59307,87220,79212,95932,73795,49056,78232,74708,89678,55588,29353,68893,99138,92240,79041,69863,96147,53178,96600,30032,66799,42173,20196,8735,48535,94862,69845,61146,70910,91670,88404,22452,97701,35650,54464,61855,59908,50767,22013,11900,87375,33585,73487,95382,52053,93009,76521,95394,65853,98105,99719,92641,83872,75321,83756,80886,5053,93804,60545,96806,24136,82381,57127,76029,11705,51507,71646,19640,56070,46999,49018,43903,52122,93524,43268,35445,89807,58969,22478,85094,73528,67585,47181,56070,50353,73293,34944,14047,91609,28155,75633,94996,97974,80539,82040,60628,21703,94441,99615,33514,78604,73388,67934,85848,65005,96242,15652,91681,60198,97034,97591,12258,37346,19105,44725,16111,65649,54707,94517,17443,44923,44166,86863,66372,61304,91047,17033,96350,64168,96975,15218,48834,92154,69923,77463,39229,70044,50937,81201,54214,67644,96923,82643,80573,39499,83052,88488,29103,75827,37339,78457,90900,78408,95624,42660,79166,20401,76406,83095,80255,95921,90938,73521,18395,33521,33505,55403,48903,98699,95109,67559,79555,98594,93625,47538,94042,90832,51426,58838,83950,74412,65740,50592,93859,97074,74692,95360,68663,69700,39980,99461,63604,83596,77602,56947,23884,88557,88100,91682,87407,72001,74247,74087,53718,85048,35715,88409,55701,51957,62702,35736,89552,37906,89734,74808,87329,88015,92962,97946,63939,12683,79416,59055,66018,30590,55206,50045,86182,36507,75685,68535,79654,76939,66508,70916,71330,50651,35652,97446,59903,54117,27737,94662,94912,84252,24785,75623,99417,34020,99202,97395,90493,98175,98705,89272,42502,70021,88252,96651,48267,92890,98901,70042,79987,94000,38047,62992,65852,35655,89063,47097,56170,68070,83187,65466,50682,37881,89307,41221,33926,34532,97636,69154,37725,87301,73210,26362,97745,97869,99633,72110,30419,90681,37994,74981,38963,72308,96160,89920,69344,43397,64487,59411,94778,78740,92206,84117,82511,69883,98060,61806,81720,66335,42318,97890,18797,81458,66929,11554,42954,93828,9122,91809,39460,88996,23152,62128,25268,96540,40383,43568,11372,56211,33641,98658,91484,55192,28667,71615,59809,83036,41461,35943,89198,75233,96576,22057,86815,96888,60629,63861,38323,90413,24157,96674,44164,81670,87670,77945,74838,98456,72676,81631,77496,75133,92182,54158,33263,80944,83215,83427,57010,79251,35635,91024,67570,66348,85512,46236,18285,85031,72292,60771,80227,41866,18076,98168,24221,40775,83179,47333,36155,36157,98585,58850,62690,56203,30948,15926,46130,79557,20693,58043,41718,35134,30221,98310,45159,70942,99974,83432,57194,64849,88848,72839,83702,95871,91694,81343,59597,77720,87352,94774,71921,62053,92626,51479,89826,27105,79100,96395,77396,86788,86054,64725,90655,82307,48685,97725,97218,69634,76215,54602,91178,69605,88737,81507,99053,95339,83917,51421,52605,43988,72047,70041,34986,67483,95365,50261,74087,89316,47562,92891,94335,97460,99746,25587,65936,61969,97297,64148,83469,64972,88197,40782,73658,64329,46358,62499,85852,94703,67852,94811,49075,55091,96024,78979,51150,46118,93540,87428,22079,76472,86267,42733,60063,45175,97593,63169,46014,95190,71832,91801,98331,18189,70181,21230,24761,91112,33289,91319,7097,84052,59381,67425,77795,73964,76868,85316,30073,89722,63864,47784,61525,74241,82663,77108,51603,86339,81058,81877,82350,76482,68679,97758,98924,14831,53261,95630,47645,89707,91264,90751,87175,24797,63538,94964,77383,76900,81948,72251,91901,80665,81720,65154,63574,85687,65002,60446,91565,41175,20102,24793,28991,39551,76332,36199,53774,28851,90418,72345,90418,91719,93649,88447,64667,85864,76394,2099,70917,99502,91384,89420,88006,77503,89868,41717,93549,52358,77387,79224,55881,56433,74199,64355,38187,70063,75018,52735,65023,75862,63979,97995,22518,47276,55489,54146,41027,45465,82086,56189,36122,20239,85050,76964,99369,94291,77393,74331,91051,62404,67493,98703,44358,44284,90878,94402,72924,42809,98739,92290,77825,70852,86463,38239,56523,91393,86532,86300,64650,89937,69902,56695,96070,58539,31774,81365,38671,50868,86781,24139,65755,80457,81656,25902,65317,60424,46214,51378,73260,27569,80981,52076,61475,71066,60464,56675,70531,96980,73725,44472,86123,97740,76738,88857,74057,81883,34277,55103,49210,50668,26993,42457,20893,22624,15281,63659,74433,81191,99866,55332,85602,82999,93509,92570,80409,93297,66705,50432,28569,81628,33462,84729,99978,56412,41958,47827,85294,80726,89270,19797,90584,97420,58219,86928,98263,76711,23769,93914,71829,82775,80332,66412,64691,96361,75218,29626,79302,84874,39318,60532,31706,11350,87759,92645,56273,44631,50307,92359,95043,75823,96941,80080,72448,77929,88225,41254,99902,47175,81011,63632,72717,99419,77696,75412,56206,34331,69681,50820,88571,83478,50135,9869,78908,93563,78095,95495,71695,34798,26228,91481,89449,40196,78512,52173,52691,70083,54313,95007,35644,39308,33367,66251,77642,12874,45934,74498,13842,80132,94913,94987,67165,94027,23994,77420,80416,95375,26241,95991,49021,80756,64398,59544,78077,65545,64662,86753,90533,76259,44846,53904,43167,14763,83657,33845,95822,78541,69965,4659,37134,61221,81915,91127,61783,99413,76851,44807,97412,93188,97052,54014,57360,53229,18578,82856,23245,92013,84233,59541,20493,94942,72815,58288,13563,38664,14641,19902,71516,84266,76943,16233,21277,63453,76589,77445,97502,89362,90230,97817,44538,93634,92088,88521,73369,67197,33126,93661,72886,91567,66565,78965,87063,94958,90095,63490,96648,65539,81940,86789,82575,80003,53643,70460,28713,84819,58383,51684,77995,61647,60265,42283,76644,93750,42179,16684,81645,61731,32192,30284,79887,89701,70721,97897,86214,87546,98533,74997,10066,65544,83594,64985,33340,54975,99419,88039,76612,72528,45918,65246,26205,64208,92751,49713,90090,76586,55308,95014,61817,54592,75747,63703,4618,86332,89408,79506,51942,77172,50175,52634,91776,96294,51655,57745,80001,76742,39997,81438,93485,33814,82291,72401,91745,49199,59556,53438,42031,73330,11756,3753,74147,92326,65736,73828,85266,76542,92878,36722,83043,69293,59176,11597,70196,65349,61106,64348,91701,85519,59929,98881,56258,85606,84872,98777,75277,98109,68725,65288,98635,53803,65603,78699,83672,82721,98002,28960,65770,61932,94933,49046,21825,57453,97439,83040,58499,76953,40014,18963,72569,84337,43405,80680,50752,75307,60418,78049,93066,37891,63835,86047,56565,73838,98826,65996,98607,98447,20233,74313,98261,58147,87051,78712,52407,90811,57967,98269,79189,82261,26107,68071,23364,93075,94955,90290,70396,61326,8173,13826,58122,80867,16001,64406,26664,81042,79016,99560,83631,50872,71650,46817,60051,90296,38963,60457,77294,50139,73007,86632,64084,29311,80933,68025,27655,55070,41177,54745,59407,85329,76927,60611,49346,95793,89417,23357,18420,43736,87716,55166,80599,82672,93967,52419,90237,94880,81358,77052,87243,72248,40274,17690,85849,76075,24634,98967,53115,75661,31509,57877,97635,86369,63807,90172,46301,68823,65324,70936,77483,45966,50827,12219,27203,84592,51477,71293,74604,94091,56929,54320,35189,85801,82546,81978,30160,58125,50002,63561,99276,91602,92937,90162,40238,41453,67715,75590,63515,78183,97568,81077,90923,95803,45086,84614,12546,48742,70414,76226,96599,67464,99191,85017,96577,84192,82447,91139,95344,44523,49684,95142,4682,82648,76760,85262,46120,61398,88960,89246,81922,88582,60498,97254,75922,99341,46678,85934,78758,3720,19200,62975,36353,41364,89595,63061,79147,84123,73841,39916,47485,46536,96892,59777,61759,93557,73947,64407,70597,96124,15708,35248,69657,82445,64459,45438,94312,78355,53150,31512,54893,18653,89354,90273,81391,60367,49020,95378,15799,25136,96888,49590,90721,55695,76344,33566,41457,83644,94809,76686,61016,50948,47195,84648,80303,54376,65199,84004,79918,73496,19817,55705,40470,64275,96259,56939,76958,76976,76331,26751,93169,83215,80508,61734,66919,36461,31454,91083,78645,59735,55757,95909,90957,80337,77223,55348,93294,67058,98773,8608,66964,67949,78259,79528,82349,84758,96838,70918,13249,28806,25865,32053,79218,79305,73129,36634,58206,45153,98989,15128,50765,86934,63786,63229,83964,97812,20555,80542,13177,93910,27398,6667,83273,47362,60996,85797,95158,13851,52732,39671,57994,34633,95636,90219,77329,81422,99860,76120,83868,65802,7808,83034,18797,85747,19582,58619,92387,32463,41201,79562,38733,47515,86897,60632,93558,80310,76549,69125,70846,5719,73920,59532,44141,18292,90054,87816,37495,91210,62166,71556,31414,81776,71965,92465,61752,62079,68468,72699,71819,91351,58709,77269,52232,4948,89190,52345,70255,83331,76095,85602,28950,11901,41979,80051,78009,97881,18435,86755,65062,34228,99892,46830,71197,81478,88430,86537,6379,86742,59129,38084,55533,95535,39001,89390,47222,91845,35876,21101,39279,17911,68357,91077,88047,89638,88744,89828,93945,70602,57526,96323,96491,79999,82048,87983,31681,75823,83662,28084,70372,69740,46976,57803,99002,88939,63157,69495,57005,66369,92401,40084,72319,97689,83303,93066,73848,98612,13709,46578,62649,97751,26366,37093,92223,34911,58138,86411,97924,37026,51600,91959,77765,64841,92896,91890,84745,89205,81833,59008,87310,72091,71909,54234,46230,60914,39006,63552,97657,44061,73980,49010,90316,84748,91107,68039,51209,52627,67069,89252,83465,76599,99651,98205,81314,60498,67721,81773,68581,99294,45804,52456,56299,94664,72464,74470,97121,89757,41566,40769,94251,82337,35598,34635,76729,79429,86496,34621,73921,32372,15969,67001,53831,25445,69389,17111,85401,9208,63465,92114,43623,86664,67836,67616,83212,23479,30388,78268,85928,43940,55850,72466,89469,48592,26012,90755,45350,62614,88529,86044,41435,87844,84284,33033,97585,62146,46319,58532,92927,67203,50617,65686,97252,30077,54024,91507,78358,63837,85667,58662,60783,82281,44814,11148,65311,48895,46338,41204,52540,66047,69897,67216,33542,84506,81795,74977,76723,96531,86505,98657,60793,97089,25112,14396,61112,72831,74519,64030,81124,44504,36015,96921,82389,43222,53873,17271,97903,33171,82181,66365,95232,66332,71156,75235,56212,71508,91963,59729,43597,54570,30871,54069,90787,70766,75090,40769,71502,67325,78382,77225,44795,70572,77536,99996,84795,48961,95449,82932,57339,57060,96047,51680,22454,50938,89121,91336,82958,94830,66238,87105,96623,69775,75316,87742,85781,96378,95158,80638,88482,97607,61717,97310,52100,88313,76733,60636,82316,45649,19296,86861,62893,85543,73246,53121,47145,55052,89928,71212,34841,75505,87875,45999,73715,94577,83738,31501,74447,56856,74966,75456,78574,82277,91632,70785,53957,78852,34634,66809,79863,69275,37354,25020,80132,64298,42680,87636,62355,92769,71651,91819,43930,90241,42739,83526,82873,72614,74757,39366,18415,31588,99071,77350,85750,10776,92114,63807,98693,68205,52666,75117,76888,41512,82175,57651,62202,73390,68995,84516,68780,37581,99229,32817,33901,65869,94372,63030,13324,79035,37269,94289,65605,95144,45548,87947,28524,72023,77660,50581,14546,61581,82867,44983,94727,83772,45034,34870,80409,71333,89047,46247,84742,58301,89200,59150,95879,92748,84151,96031,97244,52175,77647,92424,48904,52022,79979,63730,53226,59026,95443,64998,30707,33796,57972,52409,59562,79198,33292,66981,33442,66480,23581,90422,90263,52166,79864,15486,85964,9545,68780,55336,64316,81661,66549,96545,92954,42781,86422,56854,18365,45646,80123,93342,80112,72308,96426,45862,70503,40159,78998,50850,46703,66528,94077,58303,92377,98947,32775,30608,98171,52665,90876,33137,76770,91634,75733,58668,75527,69330,46726,71656,78891,64410,89670,58833,79856,94154,27663,23401,81750,70959,67373,49936,16685,96358,78287,93088,83774,57553,94104,50063,94216,34117,98563,95976,27370,59052,99068,81206,12437,70723,32733,21564,73159,62641,55457,25793,50350,86106,87190,77718,31601,76335,93773,29201,91712,97930,34596,92712,28419,54098,38117,60294,86413,39224,9642,80462,39842,37302,99986,83977,80083,99315,56912,42403,89947,38443,39871,94773,83942,84243,86824,95648,79922,64553,73469,89492,95083,30893,92588,65537,82784,57896,95560,93619,17954,32231,70249,58088,15333,99075,92403,86515,79738,98065,67147,78804,88860,85890,85745,87200,87925,66720,98003,47517,50639,93099,76723,94220,41991,98087,94615,51342,62925,71867,85947,53173,16826,16937,83819,89180,95859,89018,88034,49936,42606,82512,79870,54458,97061,92959,38176,73885,79931,78577,81135,99897,22857,65447,87317,14074,52916,63309,19061,58750,74588,63491,40114,89390,71096,49930,51701,93832,82676,42677,32203,35349,89615,78312,23773,86067,89891,55452,79349,48904,21029,41345,95395,19082,67432,68738,55053,35711,23293,68046,94831,27554,72205,86069,95999,91083,83618,55650,75538,97050,50014,94276,85138,97097,67455,35421,27785,58713,18396,83652,67444,47804,4448,77820,87596,68235,14273,71972,66010,83494,94453,13025,90121,58741,7517,49379,88681,89330,95944,51965,15913,85473,53490,12152,98935,82188,76388,68030,95772,99854,88555,64514,68174,69005,91149,71432,58967,32502,98975,54206,64387,88896,56896,18810,33401,25603,45233,29846,68658,74057,82101,95021,61407,87474,39051,73857,43249,45555,61254,58318,75682,41618,92333,39732,64712,77049,94569,25712,97515,79507,88503,69935,41476,10973,45930,46025,31385,71668,61757,27269,66338,66163,69341,56421,49482,73123,63699,85960,94385,8443,97654,65252,83125,6765,92129,80132,86037,94124,80473,73424,52882,43442,95267,22293,72507,39311,87867,63953,41060,92284,94959,81685,68733,65541,10870,94741,71678,80599,56841,63276,14928,66592,47693,83279,72601,71939,57948,96734,42252,72445,61854,83743,49373,10445,75972,68780,94294,70432,71607,81985,71262,36397,77730,26030,87512,96555,52886,52925,8737,53902,49844,93026,69667,49768,97159,98308,89315,58922,57323,82912,39351,46998,52655,39076,35323,92707,82013,86152,84932,58185,76487,83220,82304,15956,55922,89414,83739,76929,76056,96788,21175,90262,93632,26754,66562,45952,70794,10915,68019,90382,93057,98759,58025,94576,78438,91462,94796,91479,96700,96191,55092,74865,95706,74723,84824,83398,81820,77176,51179,38012,13446,86193,98608,77722,79459,96035,51327,70585,65391,96713,92914,70355,93589,98915,49189,99040,97203,56517,51121,98685,99466,74545,54679,63674,35829,59514,93440,31941,97026,92672,83377
        };
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 1651505078)));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int length = potions.length;

        int[] answers = new int[spells.length];

        for(int i = 0; i < spells.length; i++){

            int start = 0;
            int end = potions.length - 1;
            int last = -1;

            while(start <= end){
                int mid = start + (end - start) / 2;
                long resultPoiton = (long) potions[mid] * (long) spells[i]; // 조합
                if(resultPoiton == success){
                    last = mid; // 성공했으므로 마킹
                    end = mid - 1; // 앞에 성공이 있을수도 있으므로 앞으로 보냄.
                }else if(resultPoiton > success){
                    last = mid; // 성공했으므로 마킹
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

            if(last >= 0){
                int count = potions.length - last;
                answers[i] = count;
            }
        }

        return answers;
    }
}
