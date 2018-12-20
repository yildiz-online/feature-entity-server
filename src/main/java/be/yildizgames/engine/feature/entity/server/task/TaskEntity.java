/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2018 Grégory Van den Borre
 *
 * More infos available: https://www.yildiz-games.be
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
import be.yildizgames.common.model.PlayerId;

import java.security.InvalidParameterException;

/**
 * Simple container for an entity construction task data.
 *
 * @author Grégory Van den Borre
 */
public final class TaskEntity {

    /**
     * Entity's id.
     */
    private final EntityId entity;

    /**
     * Owner's id.
     */
    private final PlayerId owner;

    /**
     * Entity position.
     */
    private final Point3D position;

    /**
     * Entity type.
     */
    private final int type;

    /**
     * Time left before building is completed.
     */
    private final long timeLeft;

    public TaskEntity(final EntityId entity, final PlayerId owner, final Point3D position, final int type, final long timeLeft) {
        super();
        if (type < 0 || timeLeft < 0) {
            throw new InvalidParameterException("Value must be positive.");
        }
        assert entity != null;
        assert owner != null;
        assert position != null;
        this.entity = entity;
        this.owner = owner;
        this.position = position;
        this.type = type;
        this.timeLeft = timeLeft;
    }

    public EntityId getEntity() {
        return entity;
    }

    public PlayerId getOwner() {
        return owner;
    }

    public Point3D getPosition() {
        return position;
    }

    public int getType() {
        return type;
    }

    public long getTimeLeft() {
        return timeLeft;
    }
}
