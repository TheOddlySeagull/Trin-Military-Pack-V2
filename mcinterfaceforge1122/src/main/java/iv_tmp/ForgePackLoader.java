package iv_tmp;

import net.minecraftforge.fml.common.Mod;

/*
 * Forge pack loader for 1.12.2.
 */
@Mod(modid=ForgePackLoader.MODID, name=ForgePackLoader.MODNAME, version=ForgePackLoader.MODVER, dependencies=ForgePackLoader.DEPS, acceptedMinecraftVersions=ForgePackLoader.MCVERS)
public class ForgePackLoader{
    public static final String MODID="iv_tmp";
    public static final String MODNAME="Trin Military Pack";
    public static final String MODVER="V2.0.0";
    public static final String DEPS="required-after:mts@[22.0.0,);";
    public static final String MCVERS="[1.12.2,]";

    public ForgePackLoader(){}
}
