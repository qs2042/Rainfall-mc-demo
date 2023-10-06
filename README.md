# 配置环境

## 获取IDEA

...

## 获取mdk

forge-1.16.5-36.2.39-mdk.zip

[Forge MDK 最新版 下载地址](https://files.minecraftforge.net/net/minecraftforge/forge/)

页面上有两种版本, 分别为: `最新版(Latest)`和`推荐版(Recommended)`

选推荐版即可, 点进下载MDK的页面, 它会让你看广告才能下载(但是因为网络问题, 都不会显示出广告)

在页面中按下 `F12` 接着按下快捷键 `Ctrl + F` 输入 `showSkip` 进行搜索后, 就可以看到下载链接

```text
https://maven.minecraftforge.net/net/minecraftforge/forge/1.15.2-31.2.57/forge-1.15.2-31.2.57-mdk.zip
https://maven.minecraftforge.net/net/minecraftforge/forge/1.16.5-36.2.34/forge-1.16.5-36.2.34-mdk.zip 
```

## 获取Java

**下载**

**安装**

**环境变量**

# 构建项目

新建一个文件夹(例如: mc-demo), 然后将MDK中的文件都解压进去

接着用IDEA打开mc-demo, 下面有俩种方式:

0. File -> Open -> 选择mc-demo -> OK
0. 在mc-demo文件夹下 -> 鼠标右键 -> Open Folder as Intellij IDEA Project

打开之后IDEA会自动下载依赖, 可以通过IDEA页面的最下面的工具条, 会显示当前正在进行的任务

也可以在Build功能页查看, 依赖下载完了的话, 会出现这么一条字: "BUILD SUCCESSFUL in 10m 52s"

翻译过来就是构建成功, 花费10分钟52秒

依赖下载完后, 需要同步Gradle配置

IDEA窗口内应该会有一个小小的图标(大象+图标), 点击一下即可同步配置

或者使用快捷键进行同步: `Ctrl + Shift + O`

# 运行项目

IDEA的页面中找到 `gradle` 标签, 单击点开它会弹出一个窗口

窗口内点开 `forgegradle runs` 找到 `runClient` 双击打开

这个时候就会启动一个游戏测试端了

进到游戏里, 点开 `mods` 里面有一个 `Example Mod` 这就是你的mod信息了

# 项目结构介绍

```text
┌ src                    项目的源代码目录
│  ├ generated           自动生成的代码目录
│  ├ main                主要的源代码目录
│  │ ├ java              Java源代码目录
│  │ │  └ com.example.examplemod
│  │ │    ├ black
│  │ │    ├ item
│  │ │    ├ group
│  │ │    ├ inventory
│  │ │    └ event
│  │ └ resources         资源文件目录
│  │   ├ META-INF        ...
│  │   └ assets.[modid]  ...
│  │     ├ blockstates   ...
│  │     ├ lang          ...
│  │     ├ models        ...
│  │     └ textures      ...
│  └ test                测试的源代码目录
├ build.gradle           ...
├ gradle.properties      ...
├ gradlew                ...
├ gradlew.bat            ...
└ README.md              ...
```

# 自定义模组打包信息

打开 `build.gradle` 文件

你可以找到这三个参数:

```properties
version='1.0'
group='com.yourname.modid'
archivesBaseName='modid'
```

自定义这些属性

```text
// mod 版本
version = '1.0'
// mod 坐标
group = 'com.halfRain.demo'
// mod ID
archivesBaseName = 'demo'

// 对坐标感兴趣的可以去看: https://maven.apache.org/guides/mini/guide-naming-conventions.html
```

自定义完属性后, 在build.gradle文件中用快捷键 `Ctrl + R` 将 `examplemod` 一键全部替换为你刚刚设置的 modId

(记得将 Words 勾选上, 只筛选完整的examplemod进行替换)

最终使用快捷键 `Ctrl + Shift + O` 更新一下Gradle配置即可

打开 `ExampleMod.java` 文件, 将 `@Mod("examplemod")` 里面的 `examplemod` 替换为你之前设置的 `mod id`

# 自定义模组元信息

打开 `resources/META-INF/mods.toml` 文件

除了 modId, 其他的配置对你来说并不是很重要, 将 modid 改为你之前设置的

```toml
modLoader = "javafml"           # mod 加载器(javafml = java forge mod loader)
loaderVersion = "[36,)"         # mod 加载器版本
license = "All rights reserved" # mod 声明版权信息

[[mods]]
modId = "examplemod"            # mod ID
version = "${file.jarVersion}"  # mod 版本
displayName = "Example Mod"     # mod 显示名称
logoFile = "examplemod.png"     # mod 日志文件
credits = "Thanks for this example mod goes to Java"    # mod 致谢内容
authors = "Love, Cheese and small house plants"         # mod 作者名
description = '''这是一个demo'''                         # mod 介绍

[[dependencies.examplemod]]
modId = "forge"             # 依赖的模组ID(Forge)
mandatory = true            # 依赖的模组是必须的
versionRange = "[36,)"      # 依赖的模组版本范围(36及以上)
ordering = "NONE"           # 依赖的模组加载顺序(无序)
side = "BOTH"               # 依赖的模组在客户端和服务器端都需要加载

[[dependencies.examplemod]]
modId = "minecraft"             # 依赖的模组ID(minecraft)
mandatory = true                # 依赖的模组是必须的
versionRange = "[1.16.5,1.17)"  # 依赖的模组版本范围(1.16.5 - 1.17)
ordering = "NONE"               # 依赖的模组加载顺序(无序)
side = "BOTH"                   # 依赖的模组在客户端和服务器端都需要加载
```

# 必看的前置知识

## MC中的服务端和客户端

Minecraft属于 `C/S架构（客户端/服务端架构）`

0. 服务端(负责游戏的逻辑，数据的读写)
0. 客户端(接受用户的输入输出，根据来自服务端的数据来渲染游戏画面)

MC中的客户端和服务端的区分仅是逻辑上的区分

如果玩家处于单人模式，那么电脑上会同时存在服务端和客户端，他们处于不同的线程之中

但是当玩家连接某个服务器时，电脑上只存在客户端，服务端被转移到了远程的一台服务器上

## MC的事件

Forge 开发基本上遵循了 `事件驱动模式`

这里面涉及到三个概念:

0. 事件
    - 例如: 当方块被破环, 当玩家死亡, 当玩家进入游戏, 当渲染模型时
0. 事件处理器
    - 例如: 写一个事件处理器, 来处理 "当方块被破坏" 这个事件,
0. 总线

## MC的资源约定

# 物品

0. ItemRegistry(物品注册的地方)
0. ArmorMaterialCustom(自定义装备类型/属性)
0. ItemTierCustom(自定义工具类型/属性)

## 道具

com/example/examplemod/item/ordinary

## 食物

com/example/examplemod/item/food

## 药剂

com/example/examplemod/item/potion

## 工具

com/example/examplemod/item/tool

## 装备

com/example/examplemod/item/armor

## 方块&&装饰方块

## 红石

## bucket

##  

**创建物品**

创建一个类, 继承Forge提供的Item类

详细介绍请看: item/ObsidianIngot.class

**延期注册**

```text
介绍一下AbstractBlock.Properties的方法

dynamicShape()
noDrops()
dropsLike(Block)
lootFrom(Supplier<? extends Block>)
air()
isValidSpawn(IExtendedPositionPredicate<EntityType<?>>)
isRedstoneConductor(IPositionPredicate)
isSuffocating(IPositionPredicate)
isViewBlocking(IPositionPredicate)
hasPostProcess(IPositionPredicate)
emissiveRendering(IPositionPredicate)
requiresCorrectToolForDrops()
```

# 方块

com/example/examplemod/block

BlockRegistry

# 实体

# 生命周期

# 渲染

# 模型

# 动画

# 网络包

# Capability

# GUI

# 客户端与服务端

# 其他

## 案例

| 玩家 | 食物 | 装备 | 武器 | 工具 | 方块 | 道具 | 材料
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| R   | NULL | NULL | NULL | NULL | NULL | NULL | 通行证
| 冬日 | 冬瓜 | NULL | NULL | NULL | NULL | NULL | NULL
| 阿白 | NULL | 老虎套装 | NULL | NULL | NULL | NULL | NULL
| 阿黑 | NULL | NULL | 鬼使黑的刀 | NULL | NULL | NULL | NULL
| 鱼鱼 | 鱼汤 | NULL | NULL | NULL | NULL | NULL | 睡觉的鱼
| 花花 | 花蜜 | NULL | NULL | NULL | NULL | NULL | NULL
| 糕糕 | NULL | NULL | NULL | NULL | 白玉糕 | NULL | NULL

## 文档

https://docs.minecraftforge.net/en/1.16.x/

## NBT

```text
/give @a demo:permit{Enchantments:[{id:"mending",lvl:5}]}

{display:{Name:'{"text":"文本","color":"颜色","bold":"布尔b","italic":"布尔b","strikethrough":"布尔b","obfuscated":"布尔b","underlined":"布尔b"}',Lore:['{同Name}','{以此类推}']}}

{Damage:5}
```
