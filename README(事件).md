# 入门

基类: Event (net.minecraftforge.eventbus.api)

# AddReloadListenerEvent(Minecraft重新加载数据时)

可以用于模组注册自定义的重新加载侦听器，以便在重新加载发生时执行一些操作

# AnvilUpdateEvent(铁毡上进行物品修复、重命名或合并操作时)

可以通过监听此事件，在修改铁砧操作的结果或添加自定义的行为

# BabyEntitySpawnEvent(实体繁殖并产生一个新的幼年实体时)

可以通过监听此事件来修改新生成实体的属性或行为

# BiomeLoadingEvent(当游戏加载或生成生物群系时)

可以监听此事件，达到修改生物群系的特性、生成规则或添加自定义的内容。

# BlockEvent (Block事件)

## BlockToolInteractEvent in BlockEvent (net.minecraftforge.event.world)

## BreakEvent in BlockEvent (net.minecraftforge.event.world)

## CropGrowEvent in BlockEvent (net.minecraftforge.event.world)

## EntityPlaceEvent in BlockEvent (net.minecraftforge.event.world)

## FarmlandTrampleEvent in BlockEvent (net.minecraftforge.event.world)

## FluidPlaceBlockEvent in BlockEvent (net.minecraftforge.event.world)

## NeighborNotifyEvent in BlockEvent (net.minecraftforge.event.world)

## NoteBlockEvent (net.minecraftforge.event.world)

## PistonEvent (net.minecraftforge.event.world)

## PortalSpawnEvent in BlockEvent (net.minecraftforge.event.world)

# ChunkWatchEvent (当玩家或实体观察（加载）一个区块时)

## UnWatch in ChunkWatchEvent (net.minecraftforge.event.world)

## Watch in ChunkWatchEvent (net.minecraftforge.event.world)

# ClientChatEvent(客户端发送聊天消息时)

可以使用该事件来拦截、修改或扩展发送到服务器的聊天消息。

# ClientChatReceivedEvent (客户端接收到聊天消息时)

可以使用该事件来拦截、修改或扩展接收到的聊天消息。

# ClientPlayerChangeGameModeEvent (客户端玩家的游戏模式发生改变时)

例如，当玩家从生存模式切换到创造模式时，该事件将被触发

可以使用该事件来执行与游戏模式变化相关的操作。

# ClientPlayerNetworkEvent (客户端玩家网络事件)

## LoggedInEvent in ClientPlayerNetworkEvent (net.minecraftforge.client.event)

if (玩家 === 阿白) 踢出服务器

## LoggedOutEvent in ClientPlayerNetworkEvent (net.minecraftforge.client.event)

if (玩家 === 冬日) 将今天的存档回到昨天

## RespawnEvent in ClientPlayerNetworkEvent (net.minecraftforge.client.event)

# ColorHandlerEvent (颜色处理器事件)

## Block in ColorHandlerEvent (net.minecraftforge.client.event)

## Item in ColorHandlerEvent (net.minecraftforge.client.event)

# CommandEvent (命令事件)

提供了处理命令相关事件的机制，包括命令执行前和执行后的事件

可以使用这些事件来添加自定义命令、修改现有命令的行为以及执行额外的逻辑。

# CreateFluidSourceEvent in BlockEvent (在世界中放置流体方块并成功创建了一个源时)

BlockEvent中的一个事件，用于处理创建流体源的事件

当玩家尝试在世界中放置流体方块并成功创建了一个源时，该事件将被触发

可以使用该事件来处理自定义流体源的行为或执行其他相关的操作。

# DifficultyChangeEvent (难度改变事件)

当游戏难度级别发生改变时,该事件将被触发

可以使用该事件来监听游戏难度的变化,并执行与难度相关的操作

if (难度 == 和平) 召唤100只阿白

if (难度 == 困难) 召唤100只冬日

# DrawHighlightEvent (net.minecraftforge.client.event)

## HighlightBlock in DrawHighlightEvent (net.minecraftforge.client.event)

## HighlightEntity in DrawHighlightEvent (net.minecraftforge.client.event)

# EnchantmentLevelSetEvent (net.minecraftforge.event.enchanting)

# EntityAttributeCreationEvent (net.minecraftforge.event.entity)

# EntityAttributeModificationEvent (net.minecraftforge.event.entity)

# EntityEvent (net.minecraftforge.event.entity)

## CanUpdate in EntityEvent (net.minecraftforge.event.entity)

## EnteringChunk in EntityEvent (net.minecraftforge.event.entity)

## EntityConstructing in EntityEvent (net.minecraftforge.event.entity)

## EntityJoinWorldEvent (net.minecraftforge.event.entity)

## EntityLeaveWorldEvent (net.minecraftforge.event.entity)

## EntityMobGriefingEvent (net.minecraftforge.event.entity)

## EntityMountEvent (net.minecraftforge.event.entity)

## EntityStruckByLightningEvent (net.minecraftforge.event.entity)

## EntityTeleportEvent (net.minecraftforge.event.entity.living)

### ChorusFruit in EntityTeleportEvent (net.minecraftforge.event.entity.living)

### EnderEntity in EntityTeleportEvent (net.minecraftforge.event.entity.living)

### EnderPearl in EntityTeleportEvent (net.minecraftforge.event.entity.living)

### SpreadPlayersCommand in EntityTeleportEvent (net.minecraftforge.event.entity.living)

### TeleportCommand in EntityTeleportEvent (net.minecraftforge.event.entity.living)

## EntityTravelToDimensionEvent (net.minecraftforge.event.entity)

## ItemEvent (net.minecraftforge.event.entity.item)

### ItemExpireEvent (net.minecraftforge.event.entity.item)

### ItemTossEvent (net.minecraftforge.event.entity.item)

## LivingEvent (net.minecraftforge.event.entity.living)

### AnimalTameEvent (net.minecraftforge.event.entity.living)

### EnderTeleportEvent (net.minecraftforge.event.entity.living)

### LivingAttackEvent (net.minecraftforge.event.entity.living)

### LivingConversionEvent (net.minecraftforge.event.entity.living)

#### Post in LivingConversionEvent (net.minecraftforge.event.entity.living)

#### Pre in LivingConversionEvent (net.minecraftforge.event.entity.living)

### LivingDamageEvent (net.minecraftforge.event.entity.living)

### LivingDeathEvent (net.minecraftforge.event.entity.living)

### LivingDestroyBlockEvent (net.minecraftforge.event.entity.living)

### LivingDropsEvent (net.minecraftforge.event.entity.living)

### LivingEntityUseItemEvent (net.minecraftforge.event.entity.living)

#### Finish in LivingEntityUseItemEvent (net.minecraftforge.event.entity.living)

#### Start in LivingEntityUseItemEvent (net.minecraftforge.event.entity.living)

#### Stop in LivingEntityUseItemEvent (net.minecraftforge.event.entity.living)

#### Tick in LivingEntityUseItemEvent (net.minecraftforge.event.entity.living)

### LivingEquipmentChangeEvent (net.minecraftforge.event.entity.living)

### LivingExperienceDropEvent (net.minecraftforge.event.entity.living)

### LivingFallEvent (net.minecraftforge.event.entity.living)

### LivingHealEvent (net.minecraftforge.event.entity.living)

### LivingHurtEvent (net.minecraftforge.event.entity.living)

### LivingJumpEvent in LivingEvent (net.minecraftforge.event.entity.living)

### LivingKnockBackEvent (net.minecraftforge.event.entity.living)

### LivingPackSizeEvent (net.minecraftforge.event.entity.living)

### LivingSetAttackTargetEvent (net.minecraftforge.event.entity.living)

### LivingSpawnEvent (net.minecraftforge.event.entity.living)

#### AllowDespawn in LivingSpawnEvent (net.minecraftforge.event.entity.living)

#### CheckSpawn in LivingSpawnEvent (net.minecraftforge.event.entity.living)

#### SpecialSpawn in LivingSpawnEvent (net.minecraftforge.event.entity.living)

### LivingUpdateEvent in LivingEvent (net.minecraftforge.event.entity.living)

### LivingVisibilityEvent in LivingEvent (net.minecraftforge.event.entity.living)

### LootingLevelEvent (net.minecraftforge.event.entity.living)

### PlayerEvent (net.minecraftforge.event.entity.player)

#### AdvancementEvent (net.minecraftforge.event.entity.player)

#### AnvilRepairEvent (net.minecraftforge.event.entity.player)

#### ArrowLooseEvent (net.minecraftforge.event.entity.player)

#### ArrowNockEvent (net.minecraftforge.event.entity.player)

#### AttackEntityEvent (net.minecraftforge.event.entity.player)

#### BonemealEvent (net.minecraftforge.event.entity.player)

#### BreakSpeed in PlayerEvent (net.minecraftforge.event.entity.player)

#### Clone in PlayerEvent (net.minecraftforge.event.entity.player)

#### CriticalHitEvent (net.minecraftforge.event.entity.player)

#### EntityItemPickupEvent (net.minecraftforge.event.entity.player)

#### FillBucketEvent (net.minecraftforge.event.entity.player)

#### HarvestCheck in PlayerEvent (net.minecraftforge.event.entity.player)

#### InputUpdateEvent (net.minecraftforge.client.event)

#### ItemCraftedEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### ItemFishedEvent (net.minecraftforge.event.entity.player)

#### ItemPickupEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### ItemSmeltedEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### ItemTooltipEvent (net.minecraftforge.event.entity.player)

#### LoadFromFile in PlayerEvent (net.minecraftforge.event.entity.player)

#### NameFormat in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerBrewedPotionEvent (net.minecraftforge.event.brewing)

#### PlayerChangedDimensionEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerChangeGameModeEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerContainerEvent (net.minecraftforge.event.entity.player)

#### PlayerDestroyItemEvent (net.minecraftforge.event.entity.player)

#### PlayerFlyableFallEvent (net.minecraftforge.event.entity.player)

#### PlayerInteractEvent (net.minecraftforge.event.entity.player)

#### PlayerLoggedInEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerLoggedOutEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerRespawnEvent in PlayerEvent (net.minecraftforge.event.entity.player)

#### PlayerSetSpawnEvent (net.minecraftforge.event.entity.player)

#### PlayerSleepInBedEvent (net.minecraftforge.event.entity.player)

#### PlayerWakeUpEvent (net.minecraftforge.event.entity.player)

#### PlayerXpEvent (net.minecraftforge.event.entity.player)

#### RenderPlayerEvent (net.minecraftforge.client.event)

#### SaveToFile in PlayerEvent (net.minecraftforge.event.entity.player)

#### SleepingTimeCheckEvent (net.minecraftforge.event.entity.player)

#### StartTracking in PlayerEvent (net.minecraftforge.event.entity.player)

#### StopTracking in PlayerEvent (net.minecraftforge.event.entity.player)

#### TabListNameFormat in PlayerEvent (net.minecraftforge.event.entity.player)

#### UseHoeEvent (net.minecraftforge.event.entity.player)

#### Visibility in PlayerEvent (net.minecraftforge.event.entity.player)

### PotionColorCalculationEvent (net.minecraftforge.event.entity.living)

### PotionEvent (net.minecraftforge.event.entity.living)

#### PotionAddedEvent in PotionEvent (net.minecraftforge.event.entity.living)

#### PotionApplicableEvent in PotionEvent (net.minecraftforge.event.entity.living)

#### PotionExpiryEvent in PotionEvent (net.minecraftforge.event.entity.living)

#### PotionRemoveEvent in PotionEvent (net.minecraftforge.event.entity.living)

### SleepingLocationCheckEvent (net.minecraftforge.event.entity.player)

## PlaySoundAtEntityEvent (net.minecraftforge.event.entity)

## ProjectileImpactEvent (net.minecraftforge.event.entity)

    ### Arrow in ProjectileImpactEvent (net.minecraftforge.event.entity)
    ### Fireball in ProjectileImpactEvent (net.minecraftforge.event.entity)
    ### FireworkRocket in ProjectileImpactEvent (net.minecraftforge.event.entity)
    ### FishingBobber in ProjectileImpactEvent (net.minecraftforge.event.entity)
    ### Throwable in ProjectileImpactEvent (net.minecraftforge.event.entity)

## RenderNameplateEvent (net.minecraftforge.client.event)

## Size in EntityEvent (net.minecraftforge.event.entity)

## ZombieEvent (net.minecraftforge.event.entity.living)

    ### SummonAidEvent in ZombieEvent (net.minecraftforge.event.entity.living)

# EntityViewRenderEvent (net.minecraftforge.client.event)

## CameraSetup in EntityViewRenderEvent (net.minecraftforge.client.event)

## FogColors in EntityViewRenderEvent (net.minecraftforge.client.event)

## FogEvent in EntityViewRenderEvent (net.minecraftforge.client.event)

## FOVModifier in EntityViewRenderEvent (net.minecraftforge.client.event)

# ExplosionEvent (net.minecraftforge.event.world)

## Detonate in ExplosionEvent (net.minecraftforge.event.world)

## Start in ExplosionEvent (net.minecraftforge.event.world)

# FOVUpdateEvent (net.minecraftforge.client.event)

# FurnaceFuelBurnTimeEvent (net.minecraftforge.event.furnace)

# GatherDataEvent (net.minecraftforge.fml.event.lifecycle)

# GatherLoginPayloadsEvent in NetworkEvent (net.minecraftforge.fml.network)

# GenericEvent (net.minecraftforge.eventbus.api)

## AttachCapabilitiesEvent (net.minecraftforge.event)

## RegistryEvent (net.minecraftforge.event)

# GuiContainerEvent (net.minecraftforge.client.event)

## DrawBackground in GuiContainerEvent (net.minecraftforge.client.event)

## DrawForeground in GuiContainerEvent (net.minecraftforge.client.event)

# GuiOpenEvent (net.minecraftforge.client.event)

# GuiScreenEvent (net.minecraftforge.client.event)

## BackgroundDrawnEvent in GuiScreenEvent (net.minecraftforge.client.event)

## DrawScreenEvent in GuiScreenEvent (net.minecraftforge.client.event)

## InitGuiEvent in GuiScreenEvent (net.minecraftforge.client.event)

## KeyboardCharTypedEvent in GuiScreenEvent (net.minecraftforge.client.event)

## KeyboardKeyEvent in GuiScreenEvent (net.minecraftforge.client.event)

## MouseInputEvent in GuiScreenEvent (net.minecraftforge.client.event)

## PotionShiftEvent in GuiScreenEvent (net.minecraftforge.client.event)

# InputEvent (net.minecraftforge.client.event)

## ClickInputEvent in InputEvent (net.minecraftforge.client.event)

## KeyInputEvent in InputEvent (net.minecraftforge.client.event)

## MouseInputEvent in InputEvent (net.minecraftforge.client.event)

## MouseScrollEvent in InputEvent (net.minecraftforge.client.event)

## RawMouseEvent in InputEvent (net.minecraftforge.client.event)

# ItemAttributeModifierEvent (net.minecraftforge.event)

# LootTableLoadEvent (net.minecraftforge.event)

# ModConfigEvent in ModConfig (net.minecraftforge.fml.config)

## Loading in ModConfig (net.minecraftforge.fml.config)

## Reloading in ModConfig (net.minecraftforge.fml.config)

# ModelBakeEvent (net.minecraftforge.client.event)

# ModelRegistryEvent (net.minecraftforge.client.event)

# ModLifecycleEvent (net.minecraftforge.fml.event.lifecycle)

## FMLFingerprintViolationEvent (net.minecraftforge.fml.event.lifecycle)

## FMLModIdMappingEvent (net.minecraftforge.fml.event.lifecycle)

## ParallelDispatchEvent (net.minecraftforge.fml.event.lifecycle)

### FMLClientSetupEvent (net.minecraftforge.fml.event.lifecycle)

### FMLCommonSetupEvent (net.minecraftforge.fml.event.lifecycle)

### FMLConstructModEvent (net.minecraftforge.fml.event.lifecycle)

### FMLDedicatedServerSetupEvent (net.minecraftforge.fml.event.lifecycle)

### FMLLoadCompleteEvent (net.minecraftforge.fml.event.lifecycle)

### InterModEnqueueEvent (net.minecraftforge.fml.event.lifecycle)

### InterModProcessEvent (net.minecraftforge.fml.event.lifecycle)

# NetworkEvent (net.minecraftforge.fml.network)

## ChannelRegistrationChangeEvent in NetworkEvent (net.minecraftforge.fml.network)

## ClientCustomPayloadEvent in NetworkEvent (net.minecraftforge.fml.network)

## LoginPayloadEvent in NetworkEvent (net.minecraftforge.fml.network)

## ServerCustomPayloadEvent in NetworkEvent (net.minecraftforge.fml.network)

# NewRegistry in RegistryEvent (net.minecraftforge.event)

# OnDatapackSyncEvent (net.minecraftforge.event)

# ParticleFactoryRegisterEvent (net.minecraftforge.client.event)

# PotionBrewEvent (net.minecraftforge.event.brewing)

## Post in PotionBrewEvent (net.minecraftforge.event.brewing)

## Pre in PotionBrewEvent (net.minecraftforge.event.brewing)

# RecipesUpdatedEvent (net.minecraftforge.client.event)

# RegisterCommandsEvent (net.minecraftforge.event)

# RenderArmEvent (net.minecraftforge.client.event)

# RenderBlockOverlayEvent (net.minecraftforge.client.event)

# RenderGameOverlayEvent (net.minecraftforge.client.event)

## Post in RenderGameOverlayEvent (net.minecraftforge.client.event)

## Pre in RenderGameOverlayEvent (net.minecraftforge.client.event)

### BossInfo in RenderGameOverlayEvent (net.minecraftforge.client.event)

### Chat in RenderGameOverlayEvent (net.minecraftforge.client.event)

### Text in RenderGameOverlayEvent (net.minecraftforge.client.event)

# RenderHandEvent (net.minecraftforge.client.event)

# RenderItemInFrameEvent (net.minecraftforge.client.event)

# RenderLivingEvent (net.minecraftforge.client.event)

## Post in RenderLivingEvent (net.minecraftforge.client.event)

## Pre in RenderLivingEvent (net.minecraftforge.client.event)

# RenderTooltipEvent (net.minecraftforge.client.event)

## Color in RenderTooltipEvent (net.minecraftforge.client.event)

## Post in RenderTooltipEvent (net.minecraftforge.client.event)

## Pre in RenderTooltipEvent (net.minecraftforge.client.event)

# RenderWorldLastEvent (net.minecraftforge.client.event)

# ScreenshotEvent (net.minecraftforge.client.event)

# ServerChatEvent (net.minecraftforge.event)

# ServerLifecycleEvent (net.minecraftforge.fml.event.server)

## FMLServerAboutToStartEvent (net.minecraftforge.fml.event.server)

## FMLServerStartedEvent (net.minecraftforge.fml.event.server)

## FMLServerStartingEvent (net.minecraftforge.fml.event.server)

## FMLServerStoppedEvent (net.minecraftforge.fml.event.server)

## FMLServerStoppingEvent (net.minecraftforge.fml.event.server)

# SoundEvent (net.minecraftforge.client.event.sound)

## PlaySoundEvent (net.minecraftforge.client.event.sound)

## SoundLoadEvent (net.minecraftforge.client.event.sound)

## SoundSetupEvent (net.minecraftforge.client.event.sound)

## SoundSourceEvent in SoundEvent (net.minecraftforge.client.event.sound)

### PlaySoundSourceEvent (net.minecraftforge.client.event.sound)

### PlayStreamingSourceEvent (net.minecraftforge.client.event.sound)

# StructureSpawnListGatherEvent (net.minecraftforge.event.world)

# TagsUpdatedEvent (net.minecraftforge.event)

## CustomTagTypes in TagsUpdatedEvent (net.minecraftforge.event)

## VanillaTagTypes in TagsUpdatedEvent (net.minecraftforge.event)

# TextureStitchEvent (net.minecraftforge.client.event)

## Post in TextureStitchEvent (net.minecraftforge.client.event)

## Pre in TextureStitchEvent (net.minecraftforge.client.event)

# TickEvent (net.minecraftforge.event)

## ClientTickEvent in TickEvent (net.minecraftforge.event)

## PlayerTickEvent in TickEvent (net.minecraftforge.event)

## RenderTickEvent in TickEvent (net.minecraftforge.event)

## ServerTickEvent in TickEvent (net.minecraftforge.event)

## WorldTickEvent in TickEvent (net.minecraftforge.event)

# VillagerTradesEvent (net.minecraftforge.event.village)

# VillageSiegeEvent (net.minecraftforge.event.village)

# WandererTradesEvent (net.minecraftforge.event.village)

# WorldEvent (net.minecraftforge.event.world)

## ChunkEvent (net.minecraftforge.event.world)

### ChunkDataEvent (net.minecraftforge.event.world)

### Load in ChunkEvent (net.minecraftforge.event.world)

### Unload in ChunkEvent (net.minecraftforge.event.world)

## CreateSpawnPosition in WorldEvent (net.minecraftforge.event.world)

## Load in WorldEvent (net.minecraftforge.event.world)

## PotentialSpawns in WorldEvent (net.minecraftforge.event.world)

## SaplingGrowTreeEvent (net.minecraftforge.event.world)

## Save in WorldEvent (net.minecraftforge.event.world)

## SleepFinishedTimeEvent (net.minecraftforge.event.world)

## Unload in WorldEvent (net.minecraftforge.event.world)

#     

0. 创建定时器类，用于持续给用户添加BUFF

0. 创建holder类, 存放装备的共享信息(套装信息)

0. 绑定 LivingEquipmentChangeEvent 事件, 检测穿戴装备事件

读取套装的配置文件(properties)

```json5
{
  "套装A": {
    number: 4,
    list: [
      "钻石头盔",
      "钻石剑"
    ],
    Effect: {
      "生命恢复": 5
    }
  }
}
```

如果该装备属于套装装备, 检查玩家的其他装备栏, 如果数量达标. 就设置BUFF
