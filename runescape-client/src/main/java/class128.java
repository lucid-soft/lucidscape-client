import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public abstract class class128 extends Node {
	class128() {
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	abstract void vmethod3150(Buffer var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	abstract void vmethod3149(ClanSettings var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljw;",
		garbageValue = "182200833"
	)
	public static class262[] method2856() {
		return new class262[]{class262.areaSound, class262.objUpdate, class262.objAdd, class262.locAdd, class262.locAnim, class262.objDel, class262.mapProjanim, class262.mapAnim, class262.locDel, class262.attachedPlayerObject}; // L: 17
	}
}
