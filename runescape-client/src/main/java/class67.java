import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class67 {
	@ObfuscatedName("c")
	static final BigInteger field886;
	@ObfuscatedName("v")
	static final BigInteger field885;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive15")
	static Archive archive15;

	static {
		field886 = new BigInteger("10001", 16); // L: 6
		field885 = new BigInteger("9fe37b01d6c9dd604ec9dac3a8f984fbedb1f08fc0497fca343345337b28c480678f8c7a110a223f9f640ce23c2a87cb43e50863b053fc40833b06e7d3cccaa2bcc0bc1d0dec6706b13f914f645aff807df27d0d0c25db5559a41061c60b85938f09e149f734dc0f485447c552692382bb4b86f53d82679ef29f3fe8501d0b4d08575f5ef3c53ea8e8bbb5b57a3c4a9106c7ef1d37281f86a2aa33fc3e2e23229dcf87a17c6ccd9e6861d2b8250eb247f8117cf52f7c82dc70f11200a882c696e9145cf343c62b5772fff886442ad84b8cd4b80696e871d6fb1015be9a0ab7693cef8e6e1744d9c8fec22570fcfd2ca37124eed77f608ceb1de574487bdb8813", 16); // L: 7
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lpn;",
		garbageValue = "-1474288872"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 249
		if (var3.exists()) { // L: 250
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 252
				return var10; // L: 253
			} catch (IOException var9) { // L: 255
			}
		}

		String var4 = ""; // L: 257
		if (class93.cacheGamebuild == 33) { // L: 258
			var4 = "_rc";
		} else if (class93.cacheGamebuild == 34) { // L: 259
			var4 = "_wip";
		}

		File var5 = new File(class123.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 260
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 261
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 263
				return var6; // L: 264
			} catch (IOException var8) { // L: 266
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 269
			return var6; // L: 270
		} catch (IOException var7) { // L: 272
			throw new RuntimeException(); // L: 273
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1525199469"
	)
	public static boolean method1885(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 25
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1608144091"
	)
	public static void method1886() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 56
	} // L: 57

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419146368"
	)
	public static void method1887() {
		class437.DBRowType_cache.clear(); // L: 90
	} // L: 91
}
