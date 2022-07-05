import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1886230441
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1580613665
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -957882951
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 900719109
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 604774139
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1750111550"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "-100"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) { // L: 25
				return; // L: 28
			}

			this.decodeNext(var1, var3, var2); // L: 26
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;III)V",
		garbageValue = "-2023862800"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 31
			this.rgb = var1.readMedium();
		}

	} // L: 33

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1276241137"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 36
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 37
		double var6 = (double)(var1 & 255) / 256.0D; // L: 38
		double var8 = var2; // L: 39
		if (var4 < var2) { // L: 40
			var8 = var4;
		}

		if (var6 < var8) { // L: 41
			var8 = var6;
		}

		double var10 = var2; // L: 42
		if (var4 > var2) { // L: 43
			var10 = var4;
		}

		if (var6 > var10) { // L: 44
			var10 = var6;
		}

		double var12 = 0.0D; // L: 45
		double var14 = 0.0D; // L: 46
		double var16 = (var10 + var8) / 2.0D; // L: 47
		if (var8 != var10) { // L: 48
			if (var16 < 0.5D) { // L: 49
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 50
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 51
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 52
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 53
			}
		}

		var12 /= 6.0D; // L: 55
		this.saturation = (int)(var14 * 256.0D); // L: 56
		this.lightness = (int)(256.0D * var16); // L: 57
		if (this.saturation < 0) { // L: 58
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 59
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 60
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 61
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 62
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 63
		}

		if (this.hueMultiplier < 1) { // L: 64
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 65
	} // L: 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljn;",
		garbageValue = "-2098307250"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.RUN_CLIENTSCRIPT, ServerPacket.IF_SETEVENTS, ServerPacket.OBJ_DEL, ServerPacket.MAP_PROJANIM, ServerPacket.AREA_SOUND, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_SESSIONTOKEN, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.MAP_ANIM, ServerPacket.REBUILD_STATIC, ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket.MESSAGE_CLANCHANNEL, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.ATTACHED_PLAYER_OBJECT, ServerPacket.CAM_SHAKE, ServerPacket.PLAYER_SPOTANIM_SPECIFIC, ServerPacket.SYNTH_SOUND, ServerPacket.OBJ_UPDATE, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.NPC_INFO_LARGE, ServerPacket.NPC_ANIM_SPECIFIC, ServerPacket.NPC_INFO_SMALL_LEGACY, ServerPacket.NPC_INFO_LARGE_LEGACY, ServerPacket.REBOOT_TIMER, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.LOC_DEL, ServerPacket.OBJ_ADD, ServerPacket.RESET_ANIMS, ServerPacket.MIDI_SONG_LOCATION, ServerPacket.UPDATE_IGNORELIST, ServerPacket.UPDATE_UID192, ServerPacket.CAM_RESET, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_INV_STOP_TRANSMIT, ServerPacket.FREE_CAM, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT_WITHREASON, ServerPacket.VARCLAN_ENABLE, ServerPacket.HEATMAP, ServerPacket.IF_CLOSESUB, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_CLEARITEMS, ServerPacket.IF_SETMODEL, ServerPacket.REBUILD_NORMAL, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_OPEN_TOP, ServerPacket.IF_OPEN_SUB, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SETTEXT, ServerPacket.IF_SETOBJECT, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_STAT, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket.LOC_ANIM, ServerPacket.UPDATE_TRADING_POST, ServerPacket.IF_SETHIDE, ServerPacket.MESSAGE_FRIENDCHANNEL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.TRADING_POST_RESULTS, ServerPacket.IF_SETNPCHEAD, ServerPacket.IF_SETANIM, ServerPacket.MIDI_SONG, ServerPacket.CLANCHANNEL_FULL, ServerPacket.UPDATE_INV_FULL, ServerPacket.LOC_ANIM_SPECIFIC, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.CAM_LOOKAT, ServerPacket.LOGOUT, ServerPacket.VARP_LARGE, ServerPacket.NPC_INFO_SMALL, ServerPacket.IF_SETANGLE, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_V1, ServerPacket.MINIMAP_STATE, ServerPacket.SET_PLAYER_OP, ServerPacket.SET_CAMTYPE, ServerPacket.PROJANIM_SPECIFIC, ServerPacket.IF_MODEL_ROTATE, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.OPEN_URL, ServerPacket.CAM_MOVETO, ServerPacket.FRIENDLIST_LOADED, ServerPacket.SPOTANIM_SPECIFIC, ServerPacket.VARCLAN, ServerPacket.LOC_ADD, ServerPacket.VARCLAN_DISABLE, ServerPacket.SET_HINTARROW, ServerPacket.LOGOUT_TRANSFER, ServerPacket.NPC_SPOTANIM_SPECIFIC, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.CLANSETTINGS_FULL, ServerPacket.VARP_SMALL, ServerPacket.CAM_SMOOTHRESET, ServerPacket.GAMEFRAME_INIT, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.REFLECTION_CHECKER, ServerPacket.CLANSETTINGS_DELTA, ServerPacket.UPDATE_EQUIPMENT_WEIGHT, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_V2}; // L: 114
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfp;",
		garbageValue = "180"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}
}
