import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public class class65 {
	@ObfuscatedName("j")
	static final BigInteger field865;
	@ObfuscatedName("e")
	static final BigInteger field868;

	static {
		field865 = new BigInteger("10001", 16); // L: 20
		field868 = new BigInteger("9fe37b01d6c9dd604ec9dac3a8f984fbedb1f08fc0497fca343345337b28c480678f8c7a110a223f9f640ce23c2a87cb43e50863b053fc40833b06e7d3cccaa2bcc0bc1d0dec6706b13f914f645aff807df27d0d0c25db5559a41061c60b85938f09e149f734dc0f485447c552692382bb4b86f53d82679ef29f3fe8501d0b4d08575f5ef3c53ea8e8bbb5b57a3c4a9106c7ef1d37281f86a2aa33fc3e2e23229dcf87a17c6ccd9e6861d2b8250eb247f8117cf52f7c82dc70f11200a882c696e9145cf343c62b5772fff886442ad84b8cd4b80696e871d6fb1015be9a0ab7693cef8e6e1744d9c8fec22570fcfd2ca37124eed77f608ceb1de574487bdb8813", 16); // L: 21
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lci;III)V",
		garbageValue = "-1780893346"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4344
			int var3 = ScriptFrame.SequenceDefinition_get(var1).field2174; // L: 4345
			if (var3 == 1) { // L: 4346
				var0.sequenceFrame = 0; // L: 4347
				var0.sequenceFrameCycle = 0; // L: 4348
				var0.sequenceDelay = var2; // L: 4349
				var0.field1190 = 0; // L: 4350
			}

			if (var3 == 2) { // L: 4352
				var0.field1190 = 0; // L: 4353
			}
		} else if (var1 == -1 || var0.sequence == -1 || ScriptFrame.SequenceDefinition_get(var1).field2183 >= ScriptFrame.SequenceDefinition_get(var0.sequence).field2183) { // L: 4356
			var0.sequence = var1; // L: 4357
			var0.sequenceFrame = 0; // L: 4358
			var0.sequenceFrameCycle = 0; // L: 4359
			var0.sequenceDelay = var2; // L: 4360
			var0.field1190 = 0; // L: 4361
			var0.field1203 = var0.pathLength; // L: 4362
		}

	} // L: 4364
}
