import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket RUN_CLIENTSCRIPT;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETEVENTS;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket AREA_SOUND;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_SESSIONTOKEN;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket REBUILD_STATIC;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_CLANCHANNEL_SYSTEM;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_CLANCHANNEL;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket ATTACHED_PLAYER_OBJECT;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket PLAYER_SPOTANIM_SPECIFIC;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket OBJ_UPDATE;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket TRIGGER_ONDIALOGABORT;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_INFO_LARGE;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_ANIM_SPECIFIC;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_INFO_SMALL_LEGACY;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_INFO_LARGE_LEGACY;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket REBOOT_TIMER;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MIDI_SONG_LOCATION;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSMIT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket FREE_CAM;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOGOUT_WITHREASON;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket VARCLAN_ENABLE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket HEATMAP;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_CLEARITEMS;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_OPEN_TOP;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_OPEN_SUB;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETTEXT;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATECHAT;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_FRIENDCHANNEL;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket TRADING_POST_RESULTS;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CLANCHANNEL_FULL;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOC_ANIM_SPECIFIC;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_INFO_SMALL;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_V1;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MINIMAP_STATE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SET_CAMTYPE;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket PROJANIM_SPECIFIC;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket IF_MODEL_ROTATE;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket OPEN_URL;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket FRIENDLIST_LOADED;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SPOTANIM_SPECIFIC;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket VARCLAN;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOC_ADD;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket VARCLAN_DISABLE;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket SET_HINTARROW;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket LOGOUT_TRANSFER;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket NPC_SPOTANIM_SPECIFIC;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CLANCHANNEL_DELTA;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CLANSETTINGS_FULL;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CAM_SMOOTHRESET;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket GAMEFRAME_INIT;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket CLANSETTINGS_DELTA;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_EQUIPMENT_WEIGHT;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_V2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1936739439
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 615071029
	)
	@Export("length")
	public final int length;

	static {
		RUN_CLIENTSCRIPT = new ServerPacket(0, -2); // L: 5
		IF_SETEVENTS = new ServerPacket(1, 12); // L: 6
		OBJ_DEL = new ServerPacket(2, 3); // L: 7
		MAP_PROJANIM = new ServerPacket(3, 15); // L: 8
		AREA_SOUND = new ServerPacket(4, 5); // L: 9
		IF_SETCOLOUR = new ServerPacket(5, 6); // L: 10
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(6, 2); // L: 11
		UPDATE_SESSIONTOKEN = new ServerPacket(7, -1); // L: 12
		SYNC_CLIENT_VARCACHE = new ServerPacket(8, 0); // L: 13
		MAP_ANIM = new ServerPacket(9, 6); // L: 14
		REBUILD_STATIC = new ServerPacket(10, -2); // L: 15
		MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(11, -1); // L: 16
		MESSAGE_CLANCHANNEL = new ServerPacket(12, -1); // L: 17
		PING_STATISTICS_REQUEST = new ServerPacket(13, 8); // L: 18
		ATTACHED_PLAYER_OBJECT = new ServerPacket(14, 14); // L: 19
		CAM_SHAKE = new ServerPacket(15, 4); // L: 20
		PLAYER_SPOTANIM_SPECIFIC = new ServerPacket(16, 8); // L: 21
		SYNTH_SOUND = new ServerPacket(17, 5); // L: 22
		OBJ_UPDATE = new ServerPacket(18, 7); // L: 23
		TRIGGER_ONDIALOGABORT = new ServerPacket(19, 0); // L: 24
		NPC_INFO_LARGE = new ServerPacket(20, -2); // L: 25
		NPC_ANIM_SPECIFIC = new ServerPacket(21, 5); // L: 26
		NPC_INFO_SMALL_LEGACY = new ServerPacket(22, -2); // L: 27
		NPC_INFO_LARGE_LEGACY = new ServerPacket(23, -2); // L: 28
		REBOOT_TIMER = new ServerPacket(24, 2); // L: 29
		MINIMAP_FLAG_SET = new ServerPacket(25, 2); // L: 30
		LOC_DEL = new ServerPacket(26, 2); // L: 31
		OBJ_ADD = new ServerPacket(27, 5); // L: 32
		RESET_ANIMS = new ServerPacket(28, 0); // L: 33
		MIDI_SONG_LOCATION = new ServerPacket(29, 5); // L: 34
		UPDATE_IGNORELIST = new ServerPacket(30, -2); // L: 35
		UPDATE_UID192 = new ServerPacket(31, 28); // L: 36
		CAM_RESET = new ServerPacket(32, 0); // L: 37
		IF_MOVESUB = new ServerPacket(33, 8); // L: 38
		UPDATE_INV_STOP_TRANSMIT = new ServerPacket(34, 2); // L: 39
		FREE_CAM = new ServerPacket(35, 1); // L: 40
		IF_SETPLAYERHEAD = new ServerPacket(36, 4); // L: 41
		UPDATE_INV_PARTIAL = new ServerPacket(37, -2); // L: 42
		MESSAGE_GAME = new ServerPacket(38, -1); // L: 43
		LOGOUT_WITHREASON = new ServerPacket(39, 1); // L: 44
		VARCLAN_ENABLE = new ServerPacket(40, 0); // L: 45
		HEATMAP = new ServerPacket(41, 1); // L: 46
		IF_CLOSESUB = new ServerPacket(42, 4); // L: 47
		RESET_CLIENT_VARCACHE = new ServerPacket(43, 0); // L: 48
		IF_CLEARITEMS = new ServerPacket(44, 4); // L: 49
		IF_SETMODEL = new ServerPacket(45, 6); // L: 50
		REBUILD_NORMAL = new ServerPacket(46, -2); // L: 51
		MESSAGE_PRIVATE = new ServerPacket(47, -2); // L: 52
		IF_OPEN_TOP = new ServerPacket(48, 2); // L: 53
		IF_OPEN_SUB = new ServerPacket(49, 7); // L: 54
		UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPacket(50, -1); // L: 55
		IF_SETPOSITION = new ServerPacket(51, 8); // L: 56
		IF_SETTEXT = new ServerPacket(52, -2); // L: 57
		IF_SETOBJECT = new ServerPacket(53, 10); // L: 58
		PLAYER_INFO = new ServerPacket(54, -2); // L: 59
		UPDATE_STAT = new ServerPacket(55, 6); // L: 60
		CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(56, 1); // L: 61
		LOC_ANIM = new ServerPacket(57, 4); // L: 62
		UPDATE_TRADING_POST = new ServerPacket(58, 20); // L: 63
		IF_SETHIDE = new ServerPacket(59, 5); // L: 64
		MESSAGE_FRIENDCHANNEL = new ServerPacket(60, -1); // L: 65
		IF_SETSCROLLPOS = new ServerPacket(61, 6); // L: 66
		TRADING_POST_RESULTS = new ServerPacket(62, -2); // L: 67
		IF_SETNPCHEAD = new ServerPacket(63, 6); // L: 68
		IF_SETANIM = new ServerPacket(64, 6); // L: 69
		MIDI_SONG = new ServerPacket(65, 2); // L: 70
		CLANCHANNEL_FULL = new ServerPacket(66, -2); // L: 71
		UPDATE_INV_FULL = new ServerPacket(67, -2); // L: 72
		LOC_ANIM_SPECIFIC = new ServerPacket(68, 6); // L: 73
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(69, -2); // L: 74
		CAM_LOOKAT = new ServerPacket(70, 6); // L: 75
		LOGOUT = new ServerPacket(71, 0); // L: 76
		VARP_LARGE = new ServerPacket(72, 6); // L: 77
		NPC_INFO_SMALL = new ServerPacket(73, -2); // L: 78
		IF_SETANGLE = new ServerPacket(74, 10); // L: 79
		UPDATE_RUN_ENERGY = new ServerPacket(75, 1); // L: 80
		UPDATE_FRIENDCHAT_CHANNEL_V1 = new ServerPacket(76, -2); // L: 81
		MINIMAP_STATE = new ServerPacket(77, 1); // L: 82
		SET_PLAYER_OP = new ServerPacket(78, -1); // L: 83
		SET_CAMTYPE = new ServerPacket(79, 4); // L: 84
		PROJANIM_SPECIFIC = new ServerPacket(80, 17); // L: 85
		IF_MODEL_ROTATE = new ServerPacket(81, 8); // L: 86
		CHAT_FILTER_SETTINGS = new ServerPacket(82, 2); // L: 87
		UPDATE_FRIENDLIST = new ServerPacket(83, -2); // L: 88
		OPEN_URL = new ServerPacket(84, -2); // L: 89
		CAM_MOVETO = new ServerPacket(85, 6); // L: 90
		FRIENDLIST_LOADED = new ServerPacket(86, 0); // L: 91
		SPOTANIM_SPECIFIC = new ServerPacket(87, 8); // L: 92
		VARCLAN = new ServerPacket(88, -1); // L: 93
		LOC_ADD = new ServerPacket(89, 4); // L: 94
		VARCLAN_DISABLE = new ServerPacket(90, 0); // L: 95
		SET_HINTARROW = new ServerPacket(91, 6); // L: 96
		LOGOUT_TRANSFER = new ServerPacket(92, -1); // L: 97
		NPC_SPOTANIM_SPECIFIC = new ServerPacket(93, 8); // L: 98
		CLANCHANNEL_DELTA = new ServerPacket(94, -2);
		CLANSETTINGS_FULL = new ServerPacket(95, -2);
		VARP_SMALL = new ServerPacket(96, 3); // L: 101
		CAM_SMOOTHRESET = new ServerPacket(97, 4); // L: 102
		GAMEFRAME_INIT = new ServerPacket(98, -2);
		UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(99, 2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(100, -2); // L: 105
		REFLECTION_CHECKER = new ServerPacket(101, -2); // L: 106
		CLANSETTINGS_DELTA = new ServerPacket(102, -2); // L: 107
		UPDATE_EQUIPMENT_WEIGHT = new ServerPacket(103, 2);
		UPDATE_FRIENDCHAT_CHANNEL_V2 = new ServerPacket(104, -2); // L: 109
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;Ljava/lang/String;Ljava/lang/String;B)Lmt;",
		garbageValue = "30"
	)
	public static Font method5211(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 99
		int var5 = var0.getFileId(var4, var3); // L: 100
		Font var6;
		if (!Ignored.method6774(var0, var4, var5)) { // L: 103
			var6 = null; // L: 104
		} else {
			byte[] var8 = var1.takeFile(var4, var5); // L: 108
			Font var7;
			if (var8 == null) { // L: 110
				var7 = null; // L: 111
			} else {
				Font var9 = new Font(var8, class426.SpriteBuffer_xOffsets, class142.SpriteBuffer_yOffsets, class359.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, class13.SpriteBuffer_spritePalette, class421.SpriteBuffer_pixels); // L: 114
				class426.SpriteBuffer_xOffsets = null; // L: 116
				class142.SpriteBuffer_yOffsets = null; // L: 117
				class359.SpriteBuffer_spriteWidths = null; // L: 118
				class456.SpriteBuffer_spriteHeights = null; // L: 119
				class13.SpriteBuffer_spritePalette = null; // L: 120
				class421.SpriteBuffer_pixels = null; // L: 121
				var7 = var9; // L: 123
			}

			var6 = var7; // L: 125
		}

		return var6; // L: 127
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILkd;ZI)V",
		garbageValue = "-26625372"
	)
	static void method5210(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var0); // L: 4987
		int var4 = class101.localPlayer.plane; // L: 4988
		int var5 = (class101.localPlayer.x >> 7) + class28.baseX; // L: 4989
		int var6 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY; // L: 4990
		Coord var7 = new Coord(var4, var5, var6); // L: 4991
		GrandExchangeOfferAgeComparator.getWorldMap().method7292(var3, var7, var1, var2); // L: 4992
	} // L: 4993

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1821871039"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4501
		if (class101.localPlayer.x >> 7 == Client.destinationX && class101.localPlayer.y >> 7 == Client.destinationY) { // L: 4503
			Client.destinationX = 0; // L: 4504
		}

		HealthBarUpdate.method2204(); // L: 4507
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4509
			ByteArrayPool.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4510
		}

		AbstractArchive.addNpcsToScene(true); // L: 4513
		class135.method2917(); // L: 4514
		AbstractArchive.addNpcsToScene(false); // L: 4515
		World.method1627(); // L: 4516
		CollisionMap.method3907(); // L: 4517
		class201.setViewportShape(var0, var1, var2, var3, true); // L: 4518
		var0 = Client.viewportOffsetX; // L: 4519
		var1 = Client.viewportOffsetY; // L: 4520
		var2 = Client.viewportWidth; // L: 4521
		var3 = Client.viewportHeight; // L: 4522
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4523
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4524
		int var4 = Client.camAngleX; // L: 4525
		if (Client.field681 / 256 > var4) { // L: 4526
			var4 = Client.field681 / 256;
		}

		if (Client.field743[4] && Client.field745[4] + 128 > var4) { // L: 4527
			var4 = Client.field745[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4528
		KeyHandler.method301(InterfaceParent.oculusOrbFocalPointX, class181.field1992, class141.oculusOrbFocalPointY, var4, var5, GZipDecompressor.method8314(var4), var3); // L: 4529
		int var6;
		int var7;
		int var8;
		if (!Client.isCameraLocked) { // L: 4531
			var6 = class427.method7523();
		} else {
			if (class19.clientPreferences.method2245()) { // L: 4535
				var7 = PacketWriter.Client_plane; // L: 4536
			} else {
				var8 = SceneTilePaint.getTileHeight(class18.cameraX, class228.cameraZ, PacketWriter.Client_plane); // L: 4539
				if (var8 - class16.cameraY < 800 && (Tiles.Tiles_renderFlags[PacketWriter.Client_plane][class18.cameraX >> 7][class228.cameraZ >> 7] & 4) != 0) { // L: 4540
					var7 = PacketWriter.Client_plane; // L: 4541
				} else {
					var7 = 3; // L: 4544
				}
			}

			var6 = var7; // L: 4546
		}

		var7 = class18.cameraX; // L: 4548
		var8 = class16.cameraY; // L: 4549
		int var9 = class228.cameraZ; // L: 4550
		int var10 = ViewportMouse.cameraPitch; // L: 4551
		int var11 = SoundCache.cameraYaw; // L: 4552

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 4553
			if (Client.field743[var12]) { // L: 4554
				var13 = (int)(Math.random() * (double)(Client.field762[var12] * 2 + 1) - (double)Client.field762[var12] + Math.sin((double)Client.field537[var12] / 100.0D * (double)Client.field747[var12]) * (double)Client.field745[var12]); // L: 4555
				if (var12 == 0) { // L: 4556
					class18.cameraX += var13;
				}

				if (var12 == 1) { // L: 4557
					class16.cameraY += var13;
				}

				if (var12 == 2) { // L: 4558
					class228.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4559
					SoundCache.cameraYaw = var13 + SoundCache.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4560
					ViewportMouse.cameraPitch += var13; // L: 4561
					if (ViewportMouse.cameraPitch < 128) { // L: 4562
						ViewportMouse.cameraPitch = 128;
					}

					if (ViewportMouse.cameraPitch > 383) { // L: 4563
						ViewportMouse.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4567
		var13 = MouseHandler.MouseHandler_y; // L: 4568
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4569
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4570
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4571
		}

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4573
			var14 = var12 - var0; // L: 4574
			int var15 = var13 - var1; // L: 4575
			ViewportMouse.ViewportMouse_x = var14; // L: 4577
			ViewportMouse.ViewportMouse_y = var15; // L: 4578
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4579
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4580
			ViewportMouse.ViewportMouse_false0 = false; // L: 4581
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4586
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4587
		}

		Renderable.playPcmPlayers(); // L: 4590
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4591
		Renderable.playPcmPlayers(); // L: 4592
		var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 4593
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4594
		class356.scene.draw(class18.cameraX, class16.cameraY, class228.cameraZ, ViewportMouse.cameraPitch, SoundCache.cameraYaw, var6); // L: 4595
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 4596
		Renderable.playPcmPlayers(); // L: 4597
		class356.scene.clearTempGameObjects(); // L: 4598
		Client.overheadTextCount = 0; // L: 4600
		boolean var32 = false; // L: 4601
		int var16 = -1; // L: 4602
		int var17 = -1; // L: 4603
		int var18 = Players.Players_count; // L: 4604
		int[] var19 = Players.Players_indices; // L: 4605

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) { // L: 4606
			Object var31;
			if (var20 < var18) { // L: 4608
				var31 = Client.players[var19[var20]]; // L: 4609
				if (var19[var20] == Client.combatTargetPlayerIndex) { // L: 4610
					var32 = true; // L: 4611
					var16 = var20; // L: 4612
					continue;
				}

				if (var31 == class101.localPlayer) { // L: 4615
					var17 = var20; // L: 4616
					continue; // L: 4617
				}
			} else {
				var31 = Client.npcs[Client.npcIndices[var20 - var18]]; // L: 4620
			}

			class154.drawActor2d((Actor)var31, var20, var0, var1, var2, var3); // L: 4621
		}

		if (Client.renderSelf && var17 != -1) { // L: 4623
			class154.drawActor2d(class101.localPlayer, var17, var0, var1, var2, var3); // L: 4624
		}

		if (var32) { // L: 4626
			class154.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3); // L: 4627
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) { // L: 4629
			int var21 = Client.overheadTextXs[var20]; // L: 4630
			int var22 = Client.overheadTextYs[var20]; // L: 4631
			int var23 = Client.overheadTextXOffsets[var20]; // L: 4632
			int var24 = Client.overheadTextAscents[var20]; // L: 4633
			boolean var25 = true; // L: 4634

			while (var25) {
				var25 = false; // L: 4636

				for (int var30 = 0; var30 < var20; ++var30) { // L: 4637
					if (var22 + 2 > Client.overheadTextYs[var30] - Client.overheadTextAscents[var30] && var22 - var24 < Client.overheadTextYs[var30] + 2 && var21 - var23 < Client.overheadTextXs[var30] + Client.overheadTextXOffsets[var30] && var23 + var21 > Client.overheadTextXs[var30] - Client.overheadTextXOffsets[var30] && Client.overheadTextYs[var30] - Client.overheadTextAscents[var30] < var22) { // L: 4638 4639
						var22 = Client.overheadTextYs[var30] - Client.overheadTextAscents[var30]; // L: 4640
						var25 = true; // L: 4641
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20]; // L: 4646
			Client.viewportTempY = Client.overheadTextYs[var20] = var22; // L: 4647
			String var26 = Client.overheadText[var20]; // L: 4648
			if (Client.chatEffects == 0) { // L: 4649
				int var27 = 16776960; // L: 4650
				if (Client.overheadTextColors[var20] < 6) { // L: 4651
					var27 = Client.field773[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) { // L: 4652
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) { // L: 4653
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) { // L: 4654
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) { // L: 4655
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4656
					if (var28 < 50) { // L: 4657
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) { // L: 4658
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4659
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) { // L: 4661
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4662
					if (var28 < 50) { // L: 4663
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) { // L: 4664
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4665
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) { // L: 4667
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4668
					if (var28 < 50) { // L: 4669
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) { // L: 4670
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) { // L: 4671
						var27 = 16777215 - (var28 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var20] == 0) { // L: 4673
					TileItem.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) { // L: 4674
					TileItem.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) { // L: 4675
					TileItem.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) { // L: 4676
					TileItem.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) { // L: 4677
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (TileItem.fontBold12.stringWidth(var26) + 100) / 150; // L: 4678
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4679
					TileItem.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0); // L: 4680
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4681
				}

				if (Client.overheadTextEffects[var20] == 5) { // L: 4683
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4684
					int var29 = 0; // L: 4685
					if (var28 < 25) { // L: 4686
						var29 = var28 - 25;
					} else if (var28 > 125) { // L: 4687
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - TileItem.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4688
					TileItem.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0); // L: 4689
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4690
				}
			} else {
				TileItem.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4694
			}
		}

		if (Client.hintArrowType == 2) { // L: 4699
			class220.worldToScreen((Client.hintArrowX - class28.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - WorldMapLabelSize.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4700
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4701
				UserComparator4.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field555); // L: 4703
		HealthBar.method2349(var0, var1, var2, var3); // L: 4704
		class18.cameraX = var7; // L: 4705
		class16.cameraY = var8; // L: 4706
		class228.cameraZ = var9; // L: 4707
		ViewportMouse.cameraPitch = var10; // L: 4708
		SoundCache.cameraYaw = var11; // L: 4709
		if (Client.isLoading && UrlRequest.method2557(true, false) == 0) { // L: 4710
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 4711
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4712
			SequenceDefinition.drawLoadingMessage("Loading - please wait.", false); // L: 4713
		}

	} // L: 4715

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "503977504"
	)
	static final void method5209(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12263
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3113()) { // L: 12264
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12265
				if (var2.rank == -1) {
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 12267
					var3.packetBuffer.writeByte(3 + ScriptEvent.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12268
					var3.packetBuffer.writeByte(var0); // L: 12269
					var3.packetBuffer.writeShort(var1); // L: 12270
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12271
					Client.packetWriter.addNode(var3); // L: 12272
				}
			}
		}
	} // L: 12266 12273
}
