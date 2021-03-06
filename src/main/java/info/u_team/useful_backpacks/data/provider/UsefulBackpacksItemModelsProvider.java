package info.u_team.useful_backpacks.data.provider;

import static info.u_team.useful_backpacks.init.UsefulBackpacksItems.*;

import info.u_team.u_team_core.data.*;
import info.u_team.useful_backpacks.item.BackpackItem;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;

public class UsefulBackpacksItemModelsProvider extends CommonItemModelsProvider {
	
	public UsefulBackpacksItemModelsProvider(GenerationData data) {
		super(data);
	}
	
	@Override
	protected void registerModels() {
		simpleBackpackGenerated(SMALL_BACKPACK.get());
		simpleBackpackGenerated(MEDIUM_BACKPACK.get());
		simpleBackpackGenerated(LARGE_BACKPACK.get());
		simpleGenerated(ENDERCHEST_BACKPACK.get());
	}
	
	protected void simpleBackpackGenerated(BackpackItem item) {
		final String registryPath = item.getRegistryName().getPath();
		getBuilder(registryPath).parent(new UncheckedModelFile("item/generated")).texture("layer0", "item/backpack/" + item.getBackpack().getName());
	}
	
}
