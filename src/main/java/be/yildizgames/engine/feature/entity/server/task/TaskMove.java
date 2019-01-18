/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.engine.feature.entity.server.task;

import be.yildizgames.common.geometry.Point3D;
import be.yildizgames.common.model.EntityId;

/**
 * Simple container for an entity move task data.
 *
 * @author Grégory Van den Borre
 */
public final class TaskMove {

    /**
     * Entity's id.
     */
    private final EntityId entity;

    /**
     * Entity destination.
     */
    private final Point3D destination;

    /**
     * Entity speed.
     */
    private final float speed;

    public TaskMove(EntityId entity, Point3D destination, float speed) {
        super();
        assert entity != null;
        assert  destination != null;
        assert speed >= 0;
        this.entity = entity;
        this.destination = destination;
        this.speed = speed;
    }

    public EntityId getEntity() {
        return entity;
    }

    public Point3D getDestination() {
        return destination;
    }

    public float getSpeed() {
        return speed;
    }
}
