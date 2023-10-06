package com.example.examplemod.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;

public class MyMaterial {
    public static final MyMaterial AIR = (new MyMaterial.Builder(MaterialColor.NONE))
            .noCollider()
            .notSolidBlocking()
            .nonSolid()
            .replaceable()
            .build();

    public static final MyMaterial NORMAL = (new MyMaterial.Builder(MaterialColor.NONE)).build();

    // 方块的材质颜色(通过MaterialColor对象表示)
    private final MaterialColor color;

    // 方块的推动反应(通过PushReaction枚举值表示: 是否会被推动, 被推动时是否会移动...)
    private final PushReaction pushReaction;

    // 方块是否阻挡运动(true: 方块会阻塞实体的运动, false: 允许实体通过)
    private final boolean blocksMotion;

    // 方块是否可燃烧(true: 表示方块可以被火焰点燃)
    private final boolean flammable;

    // 方块是否是液体(true: 表示方块是液体)
    private final boolean liquid;

    // 方块是否是实体的完全障碍物(true: 表示方块完全阻挡实体)
    private final boolean solidBlocking;

    // 方块是否可替代(true: 表示方块可以被其他方块替换)
    private final boolean replaceable;

    // 方块是否是实体(true: 表示方块是一个实体)
    private final boolean solid;

    public MyMaterial(MaterialColor color, boolean liquid, boolean solid,
                      boolean blocksMotion, boolean solidBlocking, boolean flammable,
                      boolean replaceable, PushReaction pushReaction) {
        this.color = color;
        this.liquid = liquid;
        this.solid = solid;
        this.blocksMotion = blocksMotion;
        this.solidBlocking = solidBlocking;
        this.flammable = flammable;
        this.replaceable = replaceable;
        this.pushReaction = pushReaction;
    }

    public boolean isLiquid() {
        return this.liquid;
    }

    public boolean isSolid() {
        return this.solid;
    }

    public boolean blocksMotion() {
        return this.blocksMotion;
    }

    public boolean isFlammable() {
        return this.flammable;
    }

    public boolean isReplaceable() {
        return this.replaceable;
    }

    public boolean isSolidBlocking() {
        return this.solidBlocking;
    }

    public PushReaction getPushReaction() {
        return this.pushReaction;
    }

    public MaterialColor getColor() {
        return this.color;
    }


    public Material toMaterial() {
        return new Material(this.color, this.liquid, this.solid, this.blocksMotion, this.solidBlocking, this.flammable, this.replaceable, this.pushReaction);
    }

    public static class Builder {
        private PushReaction pushReaction = PushReaction.NORMAL;
        private boolean blocksMotion = true;
        private boolean flammable = false;
        private boolean liquid;
        private boolean replaceable;
        private boolean solid = true;
        private final MaterialColor color;
        private boolean solidBlocking = true;

        public Builder(MaterialColor materialColor) {
            this.color = materialColor;
        }

        public MyMaterial.Builder liquid() {
            this.liquid = true;
            return this;
        }

        public MyMaterial.Builder nonSolid() {
            this.solid = false;
            return this;
        }

        public MyMaterial.Builder noCollider() {
            this.blocksMotion = false;
            return this;
        }

        private MyMaterial.Builder notSolidBlocking() {
            this.solidBlocking = false;
            return this;
        }

        protected MyMaterial.Builder flammable() {
            this.flammable = true;
            return this;
        }

        public MyMaterial.Builder replaceable() {
            this.replaceable = true;
            return this;
        }

        protected MyMaterial.Builder destroyOnPush() {
            this.pushReaction = PushReaction.DESTROY;
            return this;
        }

        protected MyMaterial.Builder notPushable() {
            this.pushReaction = PushReaction.BLOCK;
            return this;
        }

        public MyMaterial build() {
            return new MyMaterial(this.color, this.liquid, this.solid, this.blocksMotion, this.solidBlocking, this.flammable, this.replaceable, this.pushReaction);
        }
    }

}
